package com.cg.smms.entities;

import java.rmi.dgc.Lease;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="shop")
public class Shop {
	@Id
	@Column(name="shopid")
private long shopId;
	
private enum shopCategory{ WHOLESALE , RETAIL };

@Column(name="shopEmployees")
private List<Employee>shopEmployees; 

@Column(name="shopName")
private String shopName;

@Column(name="customers")
private List<Customer> customers;

private enum shopStatus{ OPEN , CLOSED};

@Column(name="shopOwner")
private ShopOwner shopOwner;

@Column(name="leaseStatus")
private Lease leaseStatus;

public long getShopId() {
	return shopId;
}

public void setShopId(long shopId) {
	this.shopId = shopId;
}

public List<Employee> getShopEmployees() {
	return shopEmployees;
}

public void setShopEmployees(List<Employee> shopEmployees) {
	this.shopEmployees = shopEmployees;
}

public String getShopName() {
	return shopName;
}

public void setShopName(String shopName) {
	this.shopName = shopName;
}

public List<Customer> getCustomers() {
	return customers;
}

public void setCustomers(List<Customer> customers) {
	this.customers = customers;
}

public ShopOwner getShopOwner() {
	return shopOwner;
}

public void setShopOwner(ShopOwner shopOwner) {
	this.shopOwner = shopOwner;
}

public Lease getLeaseStatus() {
	return leaseStatus;
}

public void setLeaseStatus(Lease leaseStatus) {
	this.leaseStatus = leaseStatus;
}

public Shop(long shopId, List<Employee> shopEmployees, String shopName, List<Customer> customers, ShopOwner shopOwner,
		Lease leaseStatus) {
	this.shopId = shopId;
	this.shopEmployees = shopEmployees;
	this.shopName = shopName;
	this.customers = customers;
	this.shopOwner = shopOwner;
	this.leaseStatus = leaseStatus;
}

public Shop() {
	
}

@Override
public String toString() {
	return "Shop [shopId=" + shopId + ", shopEmployees=" + shopEmployees + ", shopName=" + shopName + ", customers="
			+ customers + ", shopOwner=" + shopOwner + ", leaseStatus=" + leaseStatus + "]";
}

}
