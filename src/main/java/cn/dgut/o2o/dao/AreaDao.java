package cn.dgut.o2o.dao;

import java.util.List;

import cn.dgut.o2o.entity.Area;

/**
 * @author tanweijian
 * @date 2018年10月2日 下午6:15:02
 * @version 1.0.0
 */
public interface AreaDao {
	/**
	 * 列出区域列表
	 * @return areaList
	 */
	List<Area> queryArea();
}
