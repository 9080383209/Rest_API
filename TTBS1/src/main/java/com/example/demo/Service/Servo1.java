package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Mode1;
import com.example.demo.Repository.Repos1;


@Service
public class Servo1 {
@Autowired
Repos1 sr;
public List<Mode1> saveinfo(List<Mode1> ss)
{
	return sr.saveAll(ss);
}
public List<Mode1> showinfo()
{
	return sr.findAll();
}
public Optional<Mode1> getbyid(Long phone_no)
{
	return sr.findById(phone_no);
}
public Mode1 updateinfo(Mode1 ss)
{
	return sr.saveAndFlush(ss);
}
public String updatebyid(Long phone_no,Mode1 ss)
{
	sr.saveAndFlush(ss);
	 if(sr.existsById(phone_no))
	 {
		 return "valid number";
	 }
	 else
	 {
		 return "please enter the valid number";
	 }
}
public String deleteat(Long phone_no)
{
	if(sr.existsById(phone_no))
	{
		sr.deleteById(phone_no);
		return "valid number";
		
	}
	else
	{
		return "Invalid number";
	}
}
public List<Mode1> sortasc(String name)
{
	return sr.findAll(Sort.by(Sort.Direction.ASC,name));
}
public List<Mode1> sortdesc(String name)
{
	return sr.findAll(Sort.by(Sort.Direction.DESC,name));
}
public List<Mode1> pagging(int pgno,int pgsize)
{
	Page<Mode1> p=sr.findAll(PageRequest.of(pgno, pgsize));
	return p.getContent();
	}

public List<Mode1> gt(int age,String name)
{
	return sr.geti(age, name);
}

public List<Mode1> gand(int age,String name)
{
	return sr.getand(age, name);
}

public List<Mode1> gstart(String name)
{
	return sr.getstart(name);
}

public List<Mode1> gend(String name)
{
	return sr.getend(name);
}

public Integer updat(String name,String name1)
{
	return sr.up(name,name1);
}

public Integer del(int id)
{
	return sr.de(id);
}
public List<Mode1> getbypage(int pgno,int pgsize){
	Page<Mode1> p=sr.findAll(PageRequest.of(pgno, pgsize));
	return p.getContent();
}
}