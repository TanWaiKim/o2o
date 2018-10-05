package cn.dgut.o2o.exceptions;
/**
 * @author tanweijian
 * @date 2018年10月3日 上午3:17:30
 * @version 1.0.0
 */
public class ShopOperationException extends RuntimeException {
	private static final long serialVersionUID = 3060858352789606173L;

	public ShopOperationException(String msg){
		super(msg);
	}
}
