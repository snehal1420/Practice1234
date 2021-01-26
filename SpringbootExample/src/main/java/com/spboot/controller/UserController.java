package com.spboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spboot.model.User;
import com.spboot.service.ServiceI;

@Controller
public class UserController {

	@Autowired
	private ServiceI s;
	
	@RequestMapping(value = "/")
	public String m1()
	{
		System.out.println("index page Called");
		return "index";
		
	}

	@RequestMapping(value ="/reg")
	public String m2()
	{
		System.out.println("Register Page Called");
		return "register";
	}
	
	@RequestMapping(value ="/log")
	public String m3()
	{
		System.out.println("Login Page Called");
		return "login";
	}
	
	@RequestMapping(value = "/regis")
	public String m4(@ModelAttribute User user)
	{
		System.out.println("Registering data");
		s.addUser(user);
		System.out.println("Controller: Data insrted");
		return"login";
	}
	
}
