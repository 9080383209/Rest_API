package com.example.demo.Controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Mode1;
import com.example.demo.Service.Servo1;




@RestController
public class Controller1 {
@Autowired
Servo1 sser;
@PostMapping("post")
public List<Mode1> disp(@RequestBody List<Mode1> ss)
{
	return sser.saveinfo(ss);
}

@GetMapping("get")
public List<Mode1> dis()
{
	return sser.showinfo();
}
@GetMapping("get/{phone_no}")
public Optional<Mode1> getid(@PathVariable Long phone_no)
{
	return sser.getbyid(phone_no);
}
@PutMapping("put")
public Mode1 update(@RequestBody Mode1 ss)
{
	return sser.updateinfo(ss);
}
@PutMapping("put/{phone_no}")
public String updateby(@PathVariable Long phone_no,@RequestBody Mode1 ss)
{
	return sser.updatebyid(phone_no,ss);
}
@DeleteMapping("delete/{phone_no}")
public String delete(@PathVariable Long phone_no)
{
	return sser.deleteat(phone_no);
}
@GetMapping("getasc/{name}")
public List<Mode1> sorta(@PathVariable String name)
{
	return sser.sortasc(name);
}
@GetMapping("getdesc/{name}")
public List<Mode1> sortd(@PathVariable String name)
{
	return sser.sortdesc(name);
}

	@GetMapping("/getn/{age}/{name}")
	public List<Mode1> gtn(@PathVariable int age,@PathVariable String name)
	{
		return sser.gt(age, name);
	}
	
	@GetMapping("/getand/{age}/{name}")
	public List<Mode1> gan(@PathVariable int age,@PathVariable String name)
	{
		return sser.gand(age, name);
	}

	@GetMapping("getlike/{name}")
	public List<Mode1> gli(@PathVariable String name)
	{
		return sser.gstart(name);
	}

	@GetMapping("getend/{name}")
	public List<Mode1> gen(@PathVariable String name)
	{
		return sser.gend(name);
	}
	
	@PutMapping("update/{name}/{id}")
	public Integer ut(@PathVariable String name,@PathVariable String id)
	{
		return sser.updat(name,id);
	}
	
	@DeleteMapping("del/{age}")
	public Integer de(@PathVariable int age)
	{
		return sser.del(age);
	}
	@GetMapping("sortandpage/{pgno}/{pgsize}")
	public List<Mode1>sortpage(@PathVariable int pgno,@PathVariable int pgsize){
		return sser.getbypage(pgno, pgsize);
	}
}