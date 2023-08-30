package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Model;
import com.example.demo.Repository.Repos;


@Service
public class Servo {
@Autowired
Repos sr;
public List<Model> saveinfo(List<Model> ss)
{
	return sr.saveAll(ss);
}
public List<Model> showinfo()
{
	return sr.findAll();
}
public String deleteinfo(String mailid)
{
	if(sr.existsById(mailid))
	{
		sr.deleteById(mailid);
		return "Your account Successfully deleted";
	}
	else
	{
		return "Please enter the valid username";
	}
}
}
