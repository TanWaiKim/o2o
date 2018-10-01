package cn.dgut.o2o.entity;

import java.util.Date;
/**
 * @author tanweijian
 * @date 2018年10月2日 上午2:50:16
 * @version 1.0.0
 */
public class PersonInfo {
	// 用户ID
	private Long userId;
	// 用户姓名
	private String name;
	// 用户生日
	private Date birthday;
	// 用户性别
	private String gender;
	// 用户手机号码
	private String phone;
	// 用户邮箱
	private String email;
	// 用户头像
	private String profileImg;
	// 用户顾客身份标识
	private Integer customerFlag;
	// 用户店家身份标识
	private Integer shopOwnerFlag;
	// 用户超级管理员身份标识
	private Integer adminFlag;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date lastEditTime;
	// 用户状态
	private Integer enableStatus;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	public Integer getCustomerFlag() {
		return customerFlag;
	}

	public void setCustomerFlag(Integer customerFlag) {
		this.customerFlag = customerFlag;
	}

	public Integer getShopOwnerFlag() {
		return shopOwnerFlag;
	}

	public void setShopOwnerFlag(Integer shopOwnerFlag) {
		this.shopOwnerFlag = shopOwnerFlag;
	}

	public Integer getAdminFlag() {
		return adminFlag;
	}

	public void setAdminFlag(Integer adminFlag) {
		this.adminFlag = adminFlag;
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

}
