package com.cg.smms.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="shop_owner")

public class ShopOwner {
	
	
	@Id
	@OneToMany(mappedBy="shopOwner",cascade=CascadeType.ALL)	
	 private List<Shop> shop= new ArrayList<>();
	@Column(name="id")
private long id;
	
	@Column(name="name")
private String name;
	
	@Column(name="address")
private String address;
	
	@Column(name="dob")
private LocalDate dob;
	
	@Column(name="shop_id")
private Shop shop_id;

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

	public Shop getShop_id() {
		return shop_id;
	}

	public void setShop_id(Shop shop_id) {
		this.shop_id = shop_id;
	}

	public ShopOwner(long id, String name, String address, LocalDate dob, Shop shop_id) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.shop_id = shop_id;
	}

	public ShopOwner() {
		
	}

	@Override
	public String toString() {
		return "ShopOwner [shop=" + shop + ", id=" + id + ", name=" + name + ", address=" + address + ", dob=" + dob
				+ ", shop_id=" + shop_id + "]";
	}

	

	
	
}

