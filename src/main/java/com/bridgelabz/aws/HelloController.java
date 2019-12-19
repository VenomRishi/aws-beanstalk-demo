package com.bridgelabz.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@GetMapping
	public String hello() {
		return "Hello World2";
	}
	@GetMapping("/aditya")
	public String adi() {
		return "Aditya is bridgelabz hero";
	}
}
