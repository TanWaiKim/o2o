package cn.dgut.o2o.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


import net.coobird.thumbnailator.Thumbnails;

/**
 * 图片处理工具类
 * @author tanweijian
 * @date 2018年10月3日 上午0:30:25
 * @version 1.0.0
 */
public class ImageUtil {
    // 日期时间格式
    private static final SimpleDateFormat sDateFormate = new SimpleDateFormat("yyyyMMddHHmmss");
    // 生成随机数类
    private static final Random random = new Random();
    
    /**
     * 创建缩略图
     * @param thumbnail 图片文件流
     * @param targetAddr 目标地址：upload/item/shop/1/
     * @return
     */
    public static String generateThumbnail(InputStream shopImgInputStream, String fileName, String targetAddr) {
        // 获取图片的随机图片名
        String realFileName = getRandomFileName();
        // 获取图片的拓展名
        String extension = getFileExtension(fileName);
        // 根据目标地址创建保存图片的目录：upload/item/shop/1/
        makeDirPath(targetAddr);
        // 形如：upload/item/shop/1/+2012548759655482564+.jpg
        String relativeAddr = targetAddr + realFileName + extension;
        // 目的图片文件：F:/image + upload/item/shop/1/2012548759655482564.jpg
        File dest = new File(PathUtil.getImgBasePath() + relativeAddr);
        try {
        	// 先将CommonsMultipartFile转为File
        	// File file = new File(PathUtil.getImgTempPath()+relativeAddr);
        	// FileUtils.copyInputStreamToFile(thumbnail.getInputStream(), file);
        	// 创建缩略图
            // Thumbnails.of(file).size(200, 200).outputQuality(0.25f).toFile(dest);
//        	File shopImgFile = new File(PathUtil.getImgTempPath() + getRandomFileName());
//        	shopImgFile.createNewFile();
//        	inputStreamToFile(thumbnail.getInputStream(), shopImgFile);
//        	Thumbnails.of(shopImgFile).size(200, 200).outputQuality(0.8f).toFile(dest);
        	Thumbnails.of(shopImgInputStream).size(200, 200).outputQuality(0.8f).toFile(dest);
        } catch (IOException e) {
            throw new RuntimeException("创建缩略图失败：" + e.toString());
        }
        return relativeAddr;
    }

    /**
     * 创建路径  upload/item/shop/1/
     * 那么 upload、item、shop这三个文件都自动创建，自动拼接F：/image
     * @param targetAddr
     */
    private static void makeDirPath(String targetAddr) {
    	// 绝对路径=根路径+相对路径
        String realFileParentPath = PathUtil.getImgBasePath() + targetAddr;
        File dirPath = new File(realFileParentPath);
        // 如果路径不存在就递归的创建
        if (!dirPath.exists()) {
            dirPath.mkdirs();
        }
    }

    /**
     * 获取输入文件流的拓展名
     * @param thumbnail
     * @return
     */
    private static String getFileExtension(String filName) {
        return filName.substring(filName.lastIndexOf("."));
    }

    /**
     * 生成随机文件名，当前年月日时分秒 + 5位随机数
     * @return
     */
    public static String getRandomFileName() {
        // 获取随机的5位数
        int rannum = random.nextInt(89999) + 10000;
        String nowTimestr = sDateFormate.format(new Date());
        return nowTimestr + rannum;
    }
    
//    /**
//     * inputStream转File类
//     * @param ins
//     * @param file
//     */
//    private static void inputStreamToFile(InputStream ins, File file){
//    	FileOutputStream os = null;
//    	try {
//			os = new FileOutputStream(file);
//			int bytesRead = 0;
//			byte[] buffer = new byte[1024];
//			while((bytesRead = ins.read(buffer)) != -1){
//				os.write(buffer, 0, bytesRead);
//			}
//		} catch (Exception e) {
//			throw new RuntimeException("调用inputStreamToFile产生异常："+e.getMessage());
//		} finally {
//			try {
//				if (os != null) {
//					os.close();
//				}
//				if (ins != null) {
//					ins.close();
//				}
//			} catch (IOException e) {
//				throw new RuntimeException("调用inputStreamToFile关闭IO流产生异常："+e.getMessage());
//			}
//		}
//    }
}
