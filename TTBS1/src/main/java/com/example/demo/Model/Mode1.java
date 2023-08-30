package com.example.demo.Model;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ticket")
public class Mode1 {
private String name;
@Id
private Long phone_no;
private int age;
private String source;
private String destination;
private String date;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="link_id")
private List<Mode2> many;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="join_id")
private Model one;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Long getPhone_no() {
	return phone_no;
}

public void setPhone_no(Long phone_no) {
	this.phone_no = phone_no;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getSource() {
	return source;
}

public void setSource(String source) {
	this.source = source;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public List<Mode2> getMany() {
	return many;
}

public void setMany(List<Mode2> many) {
	this.many = many;
}

public Model getOne() {
	return one;
}

public void setOne(Model one) {
	this.one = one;
}

public Mode1(String name, Long phone_no, int age, String source, String destination, String date,
		List<Mode2> many, Model one) {
	super();
	this.name = name;
	this.phone_no = phone_no;
	this.age = age;
	this.source = source;
	this.destination = destination;
	this.date = date;
	this.many = many;
	this.one = one;
}

public Mode1() {
	super();
	// TODO Auto-generated constructor stub
}


}