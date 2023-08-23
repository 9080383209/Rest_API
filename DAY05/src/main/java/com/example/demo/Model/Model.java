package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Book")
public class Model {
	@Id
	private String bookname;
	private float price;
	private int quantity;
	private String aname;

	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Model(String bookname, float price, int quantity, String aname, int id) {
		super();
		this.bookname = bookname;
		this.price = price;
		this.quantity = quantity;
		this.aname = aname;
		this.id = id;
	}
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
