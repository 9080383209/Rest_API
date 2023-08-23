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

import com.example.demo.Model.Model;
import com.example.demo.Service.Serv;





@RestController
public class Controller {
      @Autowired
      Serv sser;
      @PostMapping("addbook")
     public Model save(@RequestBody Model ss) {
    	  return sser.saveinfo(ss);
      }
      @GetMapping("ebook")
      public List<Model> show(){
    	  return sser.showinfo();
      }
      @GetMapping("disp/{id}")
      public Optional<Model> update(@PathVariable int id)
      {
    	  return sser.upd(id);
      }
      @PutMapping("mbook")
      public Model modify(@RequestBody Model ss) {
    	  return sser.chanegeinfo(ss);
      }
      @DeleteMapping("deletebook")
      public String del(@RequestBody Model ss) {
    	  sser.delete(ss);
    	  return "successfully deleted";
      }
      
}
