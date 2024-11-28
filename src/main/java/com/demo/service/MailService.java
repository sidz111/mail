package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	
	@Autowired
	JavaMailSender javaMailSender;
	
	public void mailSending(String sendTo, String text, String subject) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("sssurwade2212@gmail.com");
		message.setTo(sendTo);
		message.setSubject(subject);
		message.setText(text);
		javaMailSender.send(message);
	}

}
