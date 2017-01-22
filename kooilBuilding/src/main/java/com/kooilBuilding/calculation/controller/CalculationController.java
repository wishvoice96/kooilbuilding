package com.kooilBuilding.calculation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 자제 계산
 * @author wishvoice
 *
 */
@Controller
@RequestMapping("calculation")
public class CalculationController {

	@RequestMapping("/area")
	public String index() {
		System.out.println("cal==");
		return "calculation/area";
	}
}
