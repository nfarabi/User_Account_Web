package com.apex.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.apex.user.vo.User;


@Controller
@SessionAttributes("user")

public class UserController {
	@ModelAttribute ("user")
	public User setupUserdetails() {
		return new User();
		}
	
	@RequestMapping("/entryUser.do")
	public String entryUser(@ModelAttribute User user) {
	
	return "personalInfo";
	
	}
	
	
	@RequestMapping("/processAddcontact.do")
	public String entryUserContact(@ModelAttribute ("user") User user ) {
	
	return "contactInfo";
	}
	@RequestMapping("/processAddBank.do")
	public String entryUserBank(@ModelAttribute("user") User user) {
	
	return "bankInfo";
	}
	
	@RequestMapping("/processUser.do")
	public String processUser(@ModelAttribute("user") User user) {
	
	//step1
		
		
	//step2
	//step3
	
	return "success";
	}
	
	
	
}
