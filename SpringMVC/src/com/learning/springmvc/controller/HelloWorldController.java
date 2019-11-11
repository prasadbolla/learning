package com.learning.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {
	@RequestMapping(method=RequestMethod.GET)
	public String printHelloWorld(ModelMap modelMap){
		modelMap.addAttribute("message", "This is practise Test");
		return "hello";
	}

}

