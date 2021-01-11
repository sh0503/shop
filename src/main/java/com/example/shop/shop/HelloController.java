package com.example.shop.shop;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


	@GetMapping("/hello2")
	public String hello(){
		return "hello";
	}

<<<<<<< HEAD
	@GetMapping("bye")
=======
	@GetMapping("SuHyeonbye2")

>>>>>>> test
	public String bye(){
		return "bye";
	}

	@GetMapping("nice2")
	public String nice(){
		return "nice";
	}
	@GetMapping("see")
	public String see(){
		return "see";
	}

	


}
