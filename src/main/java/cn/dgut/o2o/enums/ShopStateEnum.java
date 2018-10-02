package cn.dgut.o2o.enums;

/**
 * 使用枚举表述常量数据字典
 * 
 * @author tanweijian
 * @date 2018年10月3日 上午2:07:52
 * @version 1.0.0
 */
public enum ShopStateEnum {

	CHECK(0, "审核中"), OFFLINE(-1, "非法商铺"), SUCCESS(1, "操作成功"), PASS(2, "通过认证"), INNER_ERROR(-1001,
			"操作失败"), NULL_SHOPID(-1002, "ShopId为空"), NULL_SHOP_INFO(-1003, "传入了空的信息");
	// 状态
	private int state;
	// 状态信息
	private String stateInfo;

	private ShopStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	/**
	 * 根据存入的state返回相应的enum值
	 * @param index
	 * @return
	 */
	public static ShopStateEnum stateOf(int index) {
		// 轮询
		for (ShopStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}

}
