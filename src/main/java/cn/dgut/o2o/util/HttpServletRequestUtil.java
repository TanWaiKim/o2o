package cn.dgut.o2o.util;

import javax.servlet.http.HttpServletRequest;

/**
 * 处理请求参数工具类
 * @author tanweijian
 * @date 2018年10月7日 下午4:35:16
 * @version 1.0.0
 */
public class HttpServletRequestUtil {
	/**
	 * 根据key转化为int
	 * @param request
	 * @param name
	 * @return
	 */
	public static int getInt(HttpServletRequest request, String name) {

		try {
			return Integer.decode(request.getParameter(name));
		} catch (Exception e) {
			return -1;
		}
	}

	/**
	 * 根据key转化为long
	 * @param request
	 * @param name
	 * @return
	 */
	public static long getLong(HttpServletRequest request, String name) {

		try {
			return Long.valueOf(request.getParameter(name));
		} catch (Exception e) {
			return -1;
		}
	}

	/**
	 * 根据key转化为double
	 * @param request
	 * @param name
	 * @return
	 */
	public static Double getDouble(HttpServletRequest request, String name) {

		try {
			return Double.valueOf(request.getParameter(name));
		} catch (Exception e) {
			return -1d;
		}
	}

	/**
	 * 根据key转化为boolean
	 * @param request
	 * @param name
	 * @return
	 */
	public static Boolean getBoolean(HttpServletRequest request, String name) {

		try {
			return Boolean.valueOf(request.getParameter(name));
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 根据key转化为string
	 * @param request
	 * @param name
	 * @return
	 */
	public static String getString(HttpServletRequest request, String name) {
		try {
			String result = request.getParameter(name);
			if (result != null) {
				result = result.trim();
			}
			if ("".equals(result))
				result = null;
			return result;
		} catch (Exception e) {
			return null;
		}

	}
}