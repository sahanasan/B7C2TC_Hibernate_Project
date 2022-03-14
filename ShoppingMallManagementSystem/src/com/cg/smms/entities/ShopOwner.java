package com.cg.smms.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shop_ower")

public class ShopOwner {
	@Id
	@Column(name="id")
private long id;
	
	@Column(name="name")
private String name;
	
	@Column(name="address")
private String address;
	
	@Column(name="dob")
private LocalDate dob;
	
	@Column(name="shop")
private Shop shop;

	public ShopOwner(long id, String name, String address, LocalDate dob, Shop shop) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.shop = shop;
	}

	public ShopOwner() {
		
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	@Override
	public String toString() {
		return "ShopOwner [id=" + id + ", name=" + name + ", address=" + address + ", dob=" + dob + ", shop=" + shop
				+ "]";
	}
	
	
}
