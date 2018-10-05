package cn.dgut.o2o.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.dgut.o2o.dao.ShopDao;
import cn.dgut.o2o.dto.ShopExecution;
import cn.dgut.o2o.entity.Shop;
import cn.dgut.o2o.enums.ShopStateEnum;
import cn.dgut.o2o.exceptions.ShopOperationException;
import cn.dgut.o2o.service.ShopService;
import cn.dgut.o2o.util.ImageUtil;
import cn.dgut.o2o.util.PathUtil;

/**
 * @author tanweijian
 * @date 2018年10月3日 上午2:41:58
 * @version 1.0.0
 */
@Service
public class ShopServiceImpl implements ShopService{
    @Autowired
    private ShopDao shopDao;

    @Override
    // 事务的支持
    @Transactional
    public ShopExecution addShop(Shop shop, CommonsMultipartFile shopImg) {
        // 空值判断
        if (shop == null) {
            return new ShopExecution(ShopStateEnum.NULL_SHOP_INFO);
        }

        try {
            // 给店铺信息赋值初始值
            shop.setEnableStatus(0);
            shop.setCreateTime(new Date());
            shop.setLastEditTime(new Date());
            // 添加店铺信息
            int effectedNum = shopDao.insertShop(shop);

            // 判断是否插入成功
            if (effectedNum <= 0) {
                throw new ShopOperationException("店铺创建失败");
            } else {
                if (shopImg != null) {
                    // 存储图片
                    try {
                        addShopImg(shop, shopImg);
                    } catch (Exception e) {
                        throw new ShopOperationException("addShopImg error" + e.getMessage());
                    }
                    // 更新图片信息
                    effectedNum = shopDao.updateShop(shop);
                    if (effectedNum <= 0) {
                        throw new ShopOperationException("更新图片地址失败");
                    }

                }
            }

        } catch (Exception e) {
            throw new ShopOperationException("addShop error" + e.getMessage());
        }


        return new ShopExecution(ShopStateEnum.CHECK, shop);
    }

    /**
     * 添加店铺图片
     * @param shop 店铺信息
     * @param shopImg 图片文件流
     */
    private void addShopImg(Shop shop, CommonsMultipartFile  shopImg) {
        // 获取shop图片目录的相对值路径，如：upload/item/shop/1/
        String dest = PathUtil.getShopImagePath(shop.getShopId());
        // 生成缩略图
        String shopImgAddr = ImageUtil.generateThumbnail(shopImg, dest);
        shop.setShopImg(shopImgAddr);
    }
}
