package cn.dgut.o2o.entity;

import java.util.Date;
/**
 * @author tanweijian
 * @date 2018年10月2日 上午2:48:27
 * @version 1.0.0
 */
public class ProductCategory {
	private Long productCategoryId;
	private Long shopId;
	private String productCategoryName;
	private String productCategoryDesc;
	private Integer priority;
	private Date createTime;
	private Date lastEditTime;

	public Long getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	public String getProductCategoryDesc() {
		return productCategoryDesc;
	}

	public void setProductCategoryDesc(String productCategoryDesc) {
		this.productCategoryDesc = productCategoryDesc;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}

	public String toString() {
		return "[productCategoryId=" + productCategoryId
				+ ", productCategoryIdName=" + productCategoryName + "]";
	}

}
