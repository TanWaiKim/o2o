package cn.dgut.o2o.entity;

import java.util.Date;
/**
 * @author tanweijian
 * @date 2018年10月2日 上午2:53:27
 * @version 1.0.0
 */
public class WechatAuth {
	// 微信ID
	private Long wechatAuthId;
	// 关联用户ID
	private Long userId;
	// 公众号与微信号绑定的唯一标识
	private String openId;
	// 创建时间
	private Date createTime;
	private PersonInfo personInfo;

	public Long getWechatAuthId() {
		return wechatAuthId;
	}

	public void setWechatAuthId(Long wechatAuthId) {
		this.wechatAuthId = wechatAuthId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

}
