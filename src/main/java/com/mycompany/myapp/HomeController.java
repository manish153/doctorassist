package com.mycompany.myapp;

import java.security.Principal;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model, Principal principal) {
		
		String name = principal.getName();
		model.addAttribute("username", name);
		model.addAttribute("message", "Spring Security Custom Form example");
		logger.info("Welcome home! The client locale is {}.");
		return "home";
	}
	
	@RequestMapping(value = "/appointments", method = RequestMethod.GET)
	public String appointments(Model model, Principal principal){
		String name = principal.getName();
		model.addAttribute("username", name);
		logger.info("appointments");
		
		return "appointments";
	}
	
//	@RequestMapping(value = "/patientdata", method = RequestMethod.GET)
//	public String patientdata(Locale locale, Model model){
//		logger.info("patient data");
//		
//		return "patientdata";
//	}
	
	@RequestMapping(value = "/personal", method = RequestMethod.GET)
	public String personal(Locale locale, Model model){
		logger.info("personal");
		
		return "personal";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model){
		logger.info("login");
		
		return "login";
	}
	
	
	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginfailed(Locale locale, Model model){
		logger.info("Unauthorized");
		
		return "loginfailed";
	}
	
}
