package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="account")
public class Model1 {
@Id
@GeneratedValue
private int id;
private String password;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Model1() {
	super();
	// TODO Auto-generated constructor stub
}
public Model1 (int id, String password) {
	super();
	this.id = id;
	this.password = password;
}

}