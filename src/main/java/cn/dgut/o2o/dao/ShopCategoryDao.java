package cn.dgut.o2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.dgut.o2o.entity.ShopCategory;

/**
 * @author tanweijian
 * @date 2018年10月3日 上午2:45:58
 * @version 1.0.0
 */
public interface ShopCategoryDao {
	/**
	 * 条件查询店铺种类信息
	 * @param shopCategoryCondition
	 * @return
	 */
	List<ShopCategory> queryShopCategory(@Param("shopCategoryCondition") ShopCategory shopCategoryCondition);

	/**
	 * 根据店铺种类ID查询
	 * @param shopCategoryId
	 * @return
	 */
	ShopCategory queryShopCategoryById(long shopCategoryId);

	/**
	 * 根据店铺种类ID列表查询
	 * @param shopCategoryIdList
	 * @return
	 */
	List<ShopCategory> queryShopCategoryByIds(List<Long> shopCategoryIdList);

	/**
	 * 新增店铺种类信息
	 * @param shopCategory
	 * @return
	 */
	int insertShopCategory(ShopCategory shopCategory);

	/**
	 * 更新店铺种类信息
	 * @param shopCategory
	 * @return
	 */
	int updateShopCategory(ShopCategory shopCategory);

	/**
	 * 删除店铺种类信息
	 * @param shopCategoryId
	 * @return
	 */
	int deleteShopCategory(long shopCategoryId);

	/**
	 * 批量删除店铺种类信息
	 * @param shopCategoryIdList
	 * @return
	 */
	int batchDeleteShopCategory(List<Long> shopCategoryIdList);

}
