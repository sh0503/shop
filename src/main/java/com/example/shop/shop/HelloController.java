package com.example.shop.shop;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


	@GetMapping("/hello2")
	public String hello(){
		return "hello";
	}

	@GetMapping("bye")
	public String bye(){
		return "bye";
	}

	@GetMapping("nice")
	public String nice(){
		return "nice";
	}
	@GetMapping("see")
	public String see(){
		return "see";
	}

	


}
