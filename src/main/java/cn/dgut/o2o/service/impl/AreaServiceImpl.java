package cn.dgut.o2o.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dgut.o2o.dao.AreaDao;
import cn.dgut.o2o.entity.Area;
import cn.dgut.o2o.service.AreaService;

/**
 * @author tanweijian
 * @date 2018年10月2日 下午7:55:23
 * @version 1.0.0
 */
@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaDao areaDao;
	@Override
	public List<Area> getAreaList() {
		return areaDao.queryArea();
	}

}
