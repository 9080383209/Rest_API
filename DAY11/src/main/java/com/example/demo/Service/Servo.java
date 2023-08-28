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
public List<Model> getinfo()
{
	return sr.findAll();
}
public List<Model> postinfo(List<Model> ss)
{
	return sr.saveAll(ss);
}
}
