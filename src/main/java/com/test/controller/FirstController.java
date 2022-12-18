package com.test.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class FirstController {

	@GetMapping("/message")
	public String test() {
		
		return "Hello JavaInUse Called in First Service";
	}
}
