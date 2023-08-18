package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex02 {
  @Value("${var}")	
  private String name;
		@GetMapping("di")
		public String disp() {
		return "Welcome to learn"+name;
	}

}

