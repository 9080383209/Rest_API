package com.example.demo.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Empmod;
import com.example.demo.Repository.Repos;

@Service
public class Serv {
  @Autowired
  Repos sr;
  public Empmod saveinfo(Empmod ss) {
	  return sr.save(ss);
  }
  public List<Empmod>showinfo(){
	  return sr.findAll();
  }
  
 }
