package cn.dgut.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.dgut.o2o.BaseTest;
import cn.dgut.o2o.entity.Area;

/**
 * @author tanweijian
 * @date 2018年10月2日 下午6:29:03
 * @version 1.0.0
 */
public class AreaDaoTest extends BaseTest{
	@Autowired
	private AreaDao areaDao;
	
	@Test
	public void testQueryArea(){
		List<Area> areaList = areaDao.queryArea();
		assertEquals(2,areaList.size());
	}
}
