package cn.dgut.o2o.service;

import java.io.InputStream;

import cn.dgut.o2o.dto.ShopExecution;
import cn.dgut.o2o.entity.Shop;

/**
 * @author tanweijian
 * @date 2018年10月3日 上午2:39:00
 * @version 1.0.0
 */
public interface ShopService {
	/**
	 * 新增店铺
	 * @param shop 店铺信息
	 * @param shopImg 店铺图片
	 * @return
	 */
	ShopExecution addShop(Shop shop, InputStream shopImgInputStream, String fileName);
}
