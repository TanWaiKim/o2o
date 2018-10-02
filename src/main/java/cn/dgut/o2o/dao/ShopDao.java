package cn.dgut.o2o.dao;

import cn.dgut.o2o.entity.Shop;

/**
 * @author tanweijian
 * @date 2018年10月2日 下午11:44:27
 * @version 1.0.0
 */
public interface ShopDao {
	/**
	 * 新增店铺信息
	 * @param shop
	 * @return
	 */
	int insertShop(Shop shop);
	
	/**
	 * 更新店铺信息
	 * @param shop
	 * @return
	 */
	int updateShop(Shop shop);
}
