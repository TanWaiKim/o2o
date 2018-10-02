package cn.dgut.o2o.dto;

import java.util.List;

import cn.dgut.o2o.entity.Shop;
import cn.dgut.o2o.enums.ShopStateEnum;

/**
 * shop响应类
 * @author tanweijian
 * @date 2018年10月3日 上午1:59:25
 * @version 1.0.0
 */
public class ShopExecution {
	// 结果状态
	private int state;
	// 状态标识
	private String stateInfo;
	// 店铺数量
	private int count;
	// 操作店铺（增、删、改时用到）
	private Shop shop;
	// 店铺列表（查询店铺列表时用到）
	private List<Shop> shopList;
	
	/**
	 * 无参构造器
	 */
	public ShopExecution() {
		
	}
	
	/**
	 * 店铺操作失败时使用的构造器
	 * @param stateEnum
	 */
	public ShopExecution(ShopStateEnum stateEnum) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	}
	
	/**
	 * 店铺操作成功时使用的构造器，返回单个shop
	 * @param stateEnum
	 */
	public ShopExecution(ShopStateEnum stateEnum, Shop shop) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.shop = shop;
	}
	
	/**
	 * 店铺操作成功时使用的构造器，返回多个shop
	 * @param stateEnum
	 */
	public ShopExecution(ShopStateEnum stateEnum, List<Shop> shopList) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.shopList = shopList;
	}
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public List<Shop> getShopList() {
		return shopList;
	}
	public void setShopList(List<Shop> shopList) {
		this.shopList = shopList;
	}
	
}
