package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Model;
import com.example.demo.Service.Servo;

@RestController
public class Controller {
@Autowired
Servo sser;
@PostMapping("post")
public List<Model> postin(@RequestBody List<Model>ss)
{
	return sser.postinfo(ss);
}
@GetMapping("get")
public List<Model> getin()
{
	return sser.getinfo();
}
}
