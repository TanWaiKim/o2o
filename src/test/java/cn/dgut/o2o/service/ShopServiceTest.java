package cn.dgut.o2o.service;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.dgut.o2o.BaseTest;
import cn.dgut.o2o.dto.ShopExecution;
import cn.dgut.o2o.entity.Area;
import cn.dgut.o2o.entity.PersonInfo;
import cn.dgut.o2o.entity.Shop;
import cn.dgut.o2o.entity.ShopCategory;
import cn.dgut.o2o.enums.ShopStateEnum;

/**
 * @author tanweijian
 * @date 2018年10月3日 上午3:22:27
 * @version 1.0.0
 */
public class ShopServiceTest extends BaseTest {
	@Autowired
	private ShopService shopService;
	
	@Test
	public void testAddShop() throws IOException{
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
		shop.setShopName("测试店铺3");
		shop.setShopDesc("测试描述3");
		shop.setShopAddr("东莞理工学院2");
		shop.setPhone("13631789635");
		shop.setAdvice("审核中");
		shop.setEnableStatus(ShopStateEnum.CHECK.getState());
		shop.setCreateTime(new Date());
		shop.setLastEditTime(new Date());
		// 需要上传的文件
		File shopImg = new File("C:/Users/Administrator/Desktop/main.jpg");
		InputStream inputStream = new FileInputStream(shopImg);
		ShopExecution se = shopService.addShop(shop, inputStream, shopImg.getName());
		assertEquals(ShopStateEnum.CHECK.getState(),se.getState());
	}
}
