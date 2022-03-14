package com.cg.smms.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

 @Entity
 @Table(name="employee")
 
public class Employee {
	 
	 @Id
	 @Column(name="id")
private long id;
	 
	 @Column(name="name")
private String name;
	 
	 @Column(name="dob")
private LocalDate dob;
	 
	 @Column(name="salary")
private float salary;
	 
	 @Column(name="address")
private String address;
	 
	 @Column(name="designation")
private String designation;
	 
	 @Column(name="shop")
private Shop shop;

	public Employee(long id, String name, LocalDate dob, float salary, String address, String designation, Shop shop) {
		
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.address = address;
		this.designation = designation;
		this.shop = shop;
	}

	public Employee() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}
	 
}
