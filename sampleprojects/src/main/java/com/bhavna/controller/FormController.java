package com.bhavna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class FormController {
	
	@RequestMapping("/form")
	public String showForm() {
		return "form";
	}
	
	@RequestMapping(path="/handleform",method=RequestMethod.POST)
public String handleForm(@ModelAttribute("person")   PersonEntity person) {
	System.out.println(person);
	return "success";
}
}
