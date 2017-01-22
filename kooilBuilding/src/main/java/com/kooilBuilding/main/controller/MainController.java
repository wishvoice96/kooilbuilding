package com.kooilBuilding.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author wishvoice
 *
 */
@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(value ="/login", method = RequestMethod.POST)
	public String login(@RequestParam(value = "user_id", required = true) String id,
			@RequestParam(value = "password", required = true) String password, ModelMap model) {

		return "redirect:/calculation/area";
	}
}
