package cn.dgut.o2o.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.dgut.o2o.BaseTest;
import cn.dgut.o2o.entity.Area;

/**
 * @author tanweijian
 * @date 2018年10月2日 下午7:58:26
 * @version 1.0.0
 */
public class AreaServiceTest extends BaseTest {
	@Autowired
	private AreaService areaService;
	
	@Test
	public void testGetAreaList(){
		List<Area> areaList = areaService.getAreaList();
		assertEquals(2,areaList.size());
	}
}
