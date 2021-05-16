package com.xeqtr.vaccine.controller;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MailController {

	@Autowired
	private JavaMailSender javaMailSender;

	@GetMapping("mail")
	public ResponseEntity sendMail() {
		System.out.println("Sending Email...");

		sendActualMail();

		System.out.println("Done");
		return new ResponseEntity<>(HttpStatus.OK);
	}

	private void sendActualMail() {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("sil.diptesh@gmail.com", "sdptsil@rediffmail.com");

		msg.setSubject("Testing from Spring Boot");
		msg.setText("Hello World \n Spring Boot Email");

		javaMailSender.send(msg);
	}
}
