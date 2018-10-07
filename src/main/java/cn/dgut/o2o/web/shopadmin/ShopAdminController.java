package cn.dgut.o2o.web.shopadmin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author tanweijian
 * @date 2018年10月7日 下午6:46:31
 * @version 1.0.0
 */
@Controller
@RequestMapping(value = "/shopadmin", method = RequestMethod.GET)
public class ShopAdminController {
	@RequestMapping(value = "/shopoperation")
	public String shopOperation(){
		return "shop/shopoperation";
	}
}
