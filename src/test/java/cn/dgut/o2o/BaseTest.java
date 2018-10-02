package cn.dgut.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 * @author tanweijian
 * @date 2018年10月2日 下午6:29:44
 * @version 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit，spring配置文件
@ContextConfiguration({ "classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml" })
public class BaseTest {

}
