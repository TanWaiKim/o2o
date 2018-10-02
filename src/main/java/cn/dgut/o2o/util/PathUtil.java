package cn.dgut.o2o.util;
/**
 * 文件路径处理工具类
 * @author tanweijian
 * @date 2018年10月3日 上午12:57:58
 * @version 1.0.0
 */
public class PathUtil {
	// 获得系统文件分隔符
	private static String seperator = System.getProperty("file.separator");
	
	/**
	 * 获得系统存放图片的根路径
	 * @return
	 */
	public static String getImgBasePath(){
		// 获得操作系统的名称
		String os = System.getProperty("os.name");
		String basePath = "";
		// 根据不同的操作系统选择不同的根路径
		if (os.toLowerCase().startsWith("win")){
			basePath = "F:/image";
		} else {
			basePath = "/home/TanWaiKim/image/";
		}
		basePath = basePath.replace("/", seperator);
		return basePath;
	}
	
	/**
	 * 获得系统存放图片的相对（子）路径
	 * @param shopId
	 * @return
	 */
	public static String getShopImagePath(long shopId){
		String imagePath = "/upload/item/shop/" + shopId + "/";
		return imagePath.replace("/", seperator);
	}
}
