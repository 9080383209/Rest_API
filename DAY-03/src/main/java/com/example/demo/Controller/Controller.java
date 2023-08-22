package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Empmod;
import com.example.demo.Service.Serv;

@RestController
public class Controller 
{
	@Autowired
Serv sser;
	@PostMapping("Addemp")
	public Empmod save(@RequestBody Empmod ss) 
	{
		return sser.saveinfo(ss);
	}
	@GetMapping("emps")
		public  List<Empmod>show()
		{
			return  sser.showinfo();
		}

}