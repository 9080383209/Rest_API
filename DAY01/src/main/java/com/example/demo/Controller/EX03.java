package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EX03 {
       
	private String name;
	@GetMapping("gu")
	public String disp() {
		name="Green";
		return "My favourite colour is "+name;
	}
	
}
