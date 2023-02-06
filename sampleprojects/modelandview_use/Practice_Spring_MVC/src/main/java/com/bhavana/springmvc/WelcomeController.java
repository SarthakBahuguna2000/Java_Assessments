package com.bhavana.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class WelcomeController {
	@RequestMapping(value = "/Welcome.html", method = RequestMethod.GET)
	public String Welcome() {
		return "welcome in spring mvc";
	}
	/**
	 * //@GetMapping(value = "/validateuser") public ModelAndView
	 * validateUser(@RequestParam("username") String user,@RequestParam("pwd")
	 * String password, @RequestParam("age") int age) { ModelAndView mav=null;
	 * if(age>=18) { mav.setView("voter.jsp"); mav.addObject("Welcome Here"); } else
	 * { mav.setViewName("Error.jsp"); mav.addObject("You are not eligible as
	 * Voter"); } return mav;
	 * 
	 * }
	 **/
}
