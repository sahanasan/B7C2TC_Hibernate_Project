package com.cg.smms.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class MallAdmin implements Serializable {
public static final long serialversionUID= 1L;
@Id
@Column (name="id")
@GeneratedValue (strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String password;
private  Mall Mall ;
private int phone;

@OneToOne (mappedBy="mallAdmin")
private User user;



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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Mall getMall() {
	return Mall;
}
public void setMall(Mall mall) {
	Mall = Mall;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public MallAdmin(int id, String name, String password, Mall mall, int phone) {
	super();
	this.id = id;
	this.name = name;
	this.password = password;
	this.Mall = Mall;
	this.phone = phone;
}
public MallAdmin() {
	super();
}
@Override
public String toString() {
	return "MallAdmin [id=" + id + ", name=" + name + ", password=" + password + ", Mall=" + Mall + ", phone=" + phone
			+ "]";
}
}



