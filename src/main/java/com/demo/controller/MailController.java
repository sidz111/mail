package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.service.MailService;

@Controller
public class MailController {

	@Autowired
	MailService mailService;
	
	@GetMapping("/")
	public String indexPage() {
		return "index";
	}
	
	@GetMapping("/mail")
	public String homePage(Model model, @RequestParam String to,
			@RequestParam String subject,
			@RequestParam String msg) {
		
		mailService.mailSending(to, msg, subject);
		model.addAttribute("success", "Mail sended to: "+ to);
		return "success-page";
	}
}
