package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Empmod {
    @Id
    private int id;
     public Empmod() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String name;
    private int age;
    private long sly;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSly() {
		return sly;
	}
	public void setSly(long sly) {
		this.sly = sly;
	}
	public Empmod(int id, String name, int age, long sly) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sly = sly;
	}
}
