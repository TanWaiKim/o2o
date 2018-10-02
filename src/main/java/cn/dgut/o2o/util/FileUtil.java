package cn.dgut.o2o.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * 文件处理工具类
 * 
 * @author tanweijian
 * @date 2018年10月3日 上午0:29:03
 * @version 1.0.0
 */
public class FileUtil {
	// 系统文件的分隔符
	private static String seperator = System.getProperty("file.separator");
	// 时间格式化的格式
	private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss"); 
	// 随机数类
	private static final Random r = new Random();

	/**
	 * 获得系统存放图片的根路径
	 * @return
	 */
	public static String getImgBasePath() {
		// 获得操作系统的名称
		String os = System.getProperty("os.name");
		String basePath = "";
		// 根据不同的操作系统选择不同的根路径
		if (os.toLowerCase().startsWith("win")) {
			basePath = "F:/image/";
		} else {
			basePath = "/home/TanWaiKim/";
		}
		basePath = basePath.replace("/", seperator);
		return basePath;
	}

	public static String getHeadLineImagePath() {
		String headLineImagePath = "/upload/images/item/headtitle/";
		headLineImagePath = headLineImagePath.replace("/", seperator);
		return headLineImagePath;
	}

	public static String getShopCategoryImagePath() {
		String shopCategoryImagePath = "/upload/images/item/shopcategory/";
		shopCategoryImagePath = shopCategoryImagePath.replace("/", seperator);
		return shopCategoryImagePath;
	}

	public static String getPersonInfoImagePath() {
		String personInfoImagePath = "/upload/images/item/personinfo/";
		personInfoImagePath = personInfoImagePath.replace("/", seperator);
		return personInfoImagePath;
	}

	/**
	 * 获得系统存放图片的相对（子）路径
	 * @param shopId
	 * @return
	 */
	public static String getShopImagePath(long shopId) {
		StringBuilder shopImagePathBuilder = new StringBuilder();
		shopImagePathBuilder.append("/upload/images/item/shop/");
		shopImagePathBuilder.append(shopId);
		shopImagePathBuilder.append("/");
		String shopImagePath = shopImagePathBuilder.toString().replace("/", seperator);
		return shopImagePath;
	}

	/**
	 * 生成随机文件名：当前年月日时分秒+五位随机数（为了在实际项目中防止文件同名而进行的处理）
	 * @return
	 */
	public static String getRandomFileName() {
		// 获取随机的五位数
		int rannum = (int) (r.nextDouble() * (99999 - 10000 + 1)) + 10000; // 获取随机数
		// 获取当前的时间
		String nowTimeStr = sDateFormat.format(new Date()); // 当前时间
		return nowTimeStr + rannum;
	}

	/**
	 * 获取输入文件流的扩展名
	 * @param cFile 文件流
	 * @return
	 */
	public static String getFileExtension(CommonsMultipartFile cFile) {
		String originalFileName = cFile.getOriginalFilename();
		return originalFileName.substring(originalFileName.lastIndexOf("."));
	}

	/**
	 * 创建文件目录，即目标路径/home/work/TanWaiKim/xxx.jpg，那么 home work TanWaiKim这三个文件夹都会自动创建
	 * @param targetAddr 目标路径
	 */
	public static void makeDirPath(String targetAddr) {
		String realFileParentPath = FileUtil.getImgBasePath() + targetAddr;
		File dirPath = new File(realFileParentPath);
		if (!dirPath.exists()) {
			dirPath.mkdirs();
		}
	}

	/**
	 * 删除文件
	 * @param storePath
	 */
	public static void deleteFile(String storePath) {
		File file = new File(getImgBasePath() + storePath);
		if (file.exists()) {
			if (file.isDirectory()) {
				File files[] = file.listFiles();
				for (int i = 0; i < files.length; i++) {
					files[i].delete();
				}
			}
			file.delete();
		}
	}
}
