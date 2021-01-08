package com.example.shop.shop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello1")
	public String hello(){
		return "hello";
	}
	@GetMapping("bye")
	public String bye(){
		return "bye";
	}
	
}
