package com.xeqtr.vaccine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class TestController {

	@GetMapping("test")
	public void test() {
		System.out.println("Hello World");
	}
}
