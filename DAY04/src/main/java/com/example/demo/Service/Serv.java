package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Repos;
import com.example.demo.model.Model;

@Service
public class Serv {
	@Autowired
	Repos sr;
public Model saveinfo(Model ss) {
	return sr.save(ss);
}
public List<Model> showinfo(){
	return sr.findAll();
}
public Model changeinfo(Model ss) {
	return sr.saveAndFlush(ss);
}
public void delete(Model ss) {
	sr.delete(ss);
	
}

}
