package cn.dgut.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.dgut.o2o.BaseTest;
import cn.dgut.o2o.entity.Area;
import cn.dgut.o2o.entity.PersonInfo;
import cn.dgut.o2o.entity.Shop;
import cn.dgut.o2o.entity.ShopCategory;

/**
 * @author tanweijian
 * @date 2018年10月3日 上午12:05:03
 * @version 1.0.0
 */
public class ShopDaoTest extends BaseTest{
	@Autowired
	private ShopDao shopDao;
	
	@Test
	public void testInsertShop(){
		Shop shop = new Shop();
		PersonInfo owner = new PersonInfo();
		Area area = new Area();
		ShopCategory shopCategory = new ShopCategory();
		owner.setUserId(1L);
		area.setAreaId(2L);
		shopCategory.setShopCategoryId(1L);
		shop.setOwner(owner);
		shop.setArea(area);
		shop.setShopCategory(shopCategory);
		shop.setShopName("测试店铺");
		shop.setShopDesc("测试描述");
		shop.setShopAddr("东莞理工学院");
		shop.setPhone("13631789635");
		shop.setAdvice("审核中");
		shop.setShopImg("测试图片");
		shop.setEnableStatus(1);
		shop.setCreateTime(new Date());
		shop.setLastEditTime(new Date());
		int effectedNum = shopDao.insertShop(shop);
		assertEquals(1,effectedNum);
	}
	
	@Test
	public void testUpdateShop(){
		Shop shop = new Shop();
		shop.setShopId(1L);
		shop.setShopDesc("测试描述信息");
		shop.setShopAddr("东莞理工学院松山湖小区");
		shop.setLastEditTime(new Date());
		int effectedNum = shopDao.updateShop(shop);
		assertEquals(1,effectedNum);
	}
}
