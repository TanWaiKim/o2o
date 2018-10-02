package cn.dgut.o2o.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * 图片处理工具类
 * @author tanweijian
 * @date 2018年10月3日 上午0:30:25
 * @version 1.0.0
 */
public class ImageUtil {
	/**
	 * 处理缩略图（门面图、商品小图）
	 * @param thumbnail 用户传送的文件流
	 * @param targetAddr 文件保存的路径
	 * @return
	 */
	public static String generateThumbnail(CommonsMultipartFile thumbnail, String targetAddr) {
		// 自定义文件名称
		String realFileName = FileUtil.getRandomFileName();
		// 文件的扩展名
		String extension = FileUtil.getFileExtension(thumbnail);
		// 创建存放文件的目录
		FileUtil.makeDirPath(targetAddr);
		// 相对路径 = 目标路径（存放目录）+文件名+扩展名
		String relativeAddr = targetAddr + realFileName + extension;
		// 根据相对路径来创建新的文件（用来保存上传的文件）——目的位置
		File dest = new File(FileUtil.getImgBasePath() + relativeAddr);
		// 创建缩略图，并将其存放到目的位置
		try {
			Thumbnails.of(thumbnail.getInputStream()).size(200, 200).outputQuality(0.25f).toFile(dest);
		} catch (IOException e) {
			throw new RuntimeException("创建缩略图失败：" + e.toString());
		}
		return relativeAddr;
	}
	
	public static void main(String[] args) throws IOException {
		// 得到当前的classpath的绝对路径的URI
		String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		// 用水印图片对源图片加水印并进行压缩处理
		Thumbnails.of(new File("C:/Users/Administrator/Desktop/main.jpg")).size(200, 200)
				.watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/test.jpg")), 0.25f)
				.outputQuality(0.8f).toFile("C:/Users/Administrator/Desktop/new_main.jpg");
		
	}
}
