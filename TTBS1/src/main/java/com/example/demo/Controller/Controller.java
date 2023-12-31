package com.example.demo.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Model;
import com.example.demo.Service.Servo;


@RestController
public class Controller {
	@Autowired
    Servo sser;
	@PostMapping("post1")
	public List<Model> post1info(@RequestBody List<Model> ss)
	{
		return sser.saveinfo(ss);
	}
	@GetMapping("get1")
	public List<Model> get1info()
	{
		return sser.showinfo();
	}
	@DeleteMapping("delete1/{mailid}")
	public String deleteinf(@PathVariable String mailid)
	{
		return sser.deleteinfo(mailid);
	}

}
