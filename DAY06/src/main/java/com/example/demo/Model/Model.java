package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="page")
public class Model {
	@Id
	private int id;
	private String Fname;
	private String Lname;
	private String fathername;
	private String Mothername;
    private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return Mothername;
	}
	public void setMothername(String mothername) {
		Mothername = mothername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Model(int id, String fname, String lname, String fathername, String mothername, String address) {
		super();
		this.id = id;
		Fname = fname;
		Lname = lname;
		this.fathername = fathername;
		Mothername = mothername;
		this.address = address;
	}
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
