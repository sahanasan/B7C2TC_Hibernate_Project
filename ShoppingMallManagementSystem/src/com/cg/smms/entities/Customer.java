package com.cg.smms.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import java.util.List;
@Entity
@Table(name="Customer")
public class Customer implements Serializable
{
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
private int id;		// long id;
private String name;
private String 	orders;		// List<OrderDetails> orders;
private int phone;			//long phone;
private String email;

@OneToOne (cascade=CascadeType.ALL)
@JoinColumn (name="customer")
private String type;



public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getId() 
{
	return id;
}
public void setId(int id) 
{
	this.id = id;
}
public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public String getOrders() 
{
	return orders;
}
public void setOrders(String orders) 
{
	this.orders = orders;
}
public int getPhone() 
{
	return phone;
}
public void setPhone(int phone) 
{
	this.phone = phone;
}
public String getEmail() 
{
	return email;
}
public void setEmail(String email) 
{
	this.email = email;
}

public Customer(int id, String name, String orders, int phone, String email) 
{
	this.id = id;
	this.name = name;
	this.orders = orders;
	this.phone = phone;
	this.email = email;
}

public Customer() 
{
	
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", orders=" + orders + ", phone=" + phone + ", email=" + email
			+ "]";
}


}
