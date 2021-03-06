package org.avci.flowerweb;

import java.util.Map;

//import org.avci.flower.services.FlowerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FlowerWebController {

	private final Logger logger = LoggerFactory.getLogger(FlowerWebController.class);
	//private final FlowerService flowerService;

	//@Autowired
	//public FlowerWebController(FlowerService flowerService) {
	//	this.flowerService = flowerService;
	//}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Map<String, Object> model) {

		logger.debug("index() is executed!");

		//model.put("title", flowerService.getTitle(""));
		//model.put("msg", flowerService.getDesc());
			
		return "index";
	}

	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {

		logger.debug("hello() is executed - $name {}", name);

		ModelAndView model = new ModelAndView();
		model.setViewName("index");
			
		//model.addObject("title", flowerService.getTitle(name));
		//model.addObject("msg", flowerService.getDesc());
			
		return model;

	}

}
