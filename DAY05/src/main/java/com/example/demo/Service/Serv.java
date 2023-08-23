package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Model;
import com.example.demo.Repository.Repos;




@Service
public class Serv {
	
		@Autowired
		Repos sr;
		public Model saveinfo(Model ss) {
			return sr.save(ss);
		}
	    public List<Model>showinfo(){
	    	return sr.findAll();
	    }
	    public Model chanegeinfo(Model ss) {
	    	return sr.saveAndFlush(ss);
	    }
	    public Optional<Model> upd(int id)
	    {
	    	return sr.findById(id);
	    }
	    
	    public void delete(Model ss) {
	    	sr.delete(ss);
	    }
	}
	
