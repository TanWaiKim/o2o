package cn.dgut.o2o.entity;

import java.util.Date;
import java.util.List;
/**
 * @author tanweijian
 * @date 2018年10月2日 上午2:56:27
 * @version 1.0.0
 */
public class Shop {
	// 店铺ID
	private Long shopId;
	// 商家ID
	private Long ownerId;
	// 店铺类别ID
	private Long shopCategoryId;
	// 店铺名称
	private String shopName;
	// 店铺描述
	private String shopDesc;
	// 店铺地址
	private String shopAddr;
	// 联系电话
	private String phone;
	// 店铺门面
	private String shopImg;
	// 店铺经度
	private Double longitude;
	// 店铺维度
	private Double latitude;
	// 店铺权重
	private Integer priority;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date lastEditTime;
	// 店铺状态（-1：不可用，0：审核中，1：可用）
	private Integer enableStatus;
	// 店铺建议
	private String advice;

	private List<ShopAuthMap> staffList;
	private Area area;
	public PersonInfo getOwner() {
		return owner;
	}

	public void setOwner(PersonInfo owner) {
		this.owner = owner;
	}

	private PersonInfo owner;
	private ShopCategory shopCategory;
	private ShopCategory parentCategory;

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public Long getShopCategoryId() {
		return shopCategoryId;
	}

	public void setShopCategoryId(Long shopCategoryId) {
		this.shopCategoryId = shopCategoryId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopDesc() {
		return shopDesc;
	}

	public void setShopDesc(String shopDesc) {
		this.shopDesc = shopDesc;
	}

	public String getShopAddr() {
		return shopAddr;
	}

	public void setShopAddr(String shopAddr) {
		this.shopAddr = shopAddr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getShopImg() {
		return shopImg;
	}

	public void setShopImg(String shopImg) {
		this.shopImg = shopImg;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
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

	public Integer getEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}

	public List<ShopAuthMap> getStaffList() {
		return staffList;
	}

	public void setStaffList(List<ShopAuthMap> staffList) {
		this.staffList = staffList;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public ShopCategory getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(ShopCategory shopCategory) {
		this.shopCategory = shopCategory;
	}

	public String getAdvice() {
		return advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public String toString() {
		return "[shopId=" + shopId + ", shopName=" + shopName + "]";
	}

	public ShopCategory getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(ShopCategory parentCategory) {
		this.parentCategory = parentCategory;
	}

}
