package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Serv;
import com.example.demo.model.Model;


@RestController
public class Controller {
	@Autowired
	Serv sser;
	@PostMapping("addstudent")
	public Model save(@RequestBody Model ss)
	{
		return sser.saveinfo(ss);
	}
	@GetMapping("hello")
	public List<Model> show()
	{
		return sser.showinfo();
		}
	@PutMapping("update")
	public Model modify(@RequestBody Model ss) {
		return sser.changeinfo(ss);
	}
	@DeleteMapping("deletedetails")
	public String del(@RequestBody Model ss) {
		sser.delete(ss);
		return "successfully deleted";
	}

}
