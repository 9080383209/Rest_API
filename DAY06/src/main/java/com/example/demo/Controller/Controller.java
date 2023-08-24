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
import com.example.demo.Service.Servo;

@RestController
public class Controller {
	 @Autowired
     Servo sser;
     @PostMapping("pg")
    public Model save(@RequestBody Model ss) {
   	  return sser.saveinfo(ss);
     }
     @GetMapping("page")
     public List<Model> show(){
   	  return sser.showinfo();
     }
     @GetMapping("disp/{id}")
     public Optional<Model> update(@PathVariable int id)
     {
   	  return sser.upd(id);
     }
     @PutMapping("sort")
     public Model modify(@RequestBody Model ss) {
   	  return sser.chanegeinfo(ss);
     }
     @DeleteMapping("pagination")
     public String del(@RequestBody Model ss) {
   	  sser.delete(ss);
   	  return "successfully deleted";
     }
     @GetMapping("baby/Fname")
     public List<Model> gi(String Fname){
    	 return sser.gersorted(Fname);
     }
     @GetMapping("g1/{pgno}/{pgsize}")
     public List<Model> gf(@PathVariable int pgno,@PathVariable int pgsize){
    	 return sser.tage(pgno,pgsize);
     }
}
