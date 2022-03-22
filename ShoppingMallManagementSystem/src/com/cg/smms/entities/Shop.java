package com.cg.smms.entities;

import java.io.Serializable;
import java.rmi.dgc.Lease;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="shop")
@Inheritance(strategy=InheritanceType.JOINED)

public class Shop implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	
	
	//connection of employee Pojo class
	@OneToMany( mappedBy ="shop_id",cascade=CascadeType.ALL)
	private	Set<Employee> employees= new HashSet<>();
	
	//connection of item pojo class
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="item_id")
	private Item item_id;
	
	//connection of customers pojo class
     @OneToMany(mappedBy="id",cascade=CascadeType.ALL)	
	 private List<Customer> customers;
     
     //connection of shopOwner pojo class
    @ManyToOne
 	@JoinColumn(name = "shop")
 	private ShopOwner shopowner;
	
	@Column(name="shop_Id")
    private int shop_Id;
	
 	
    private enum shopCategory{ WHOLESALE , RETAIL };

    @Column(name="shopEmployee_Id")
    private List<Employee>shopEmployees_Id; 

    @Column(name="shopName")
    private String shopName;

   private enum shopStatus{ OPEN , CLOSED};

   @Column(name="leaseStatus")
   private Lease leaseStatus;
  


public Shop(Set<Employee> employees, Item item_id, List<Customer> customers, ShopOwner shopowner, int shop_Id,
		List<Employee> shopEmployees_Id, String shopName, Lease leaseStatus) {
	super();
	this.employees = employees;
	this.item_id = item_id;
	this.customers = customers;
	this.shopowner = shopowner;
	this.shop_Id = shop_Id;
	this.shopEmployees_Id = shopEmployees_Id;
	this.shopName = shopName;
	this.leaseStatus = leaseStatus;
}

public Shop() {
	
}

public Set<Employee> getEmployees() {
	return employees;
}

public void setEmployees(Set<Employee> employees) {
	this.employees = employees;
}

public Item getItem_id() {
	return item_id;
}

public void setItem_id(Item item_id) {
	this.item_id = item_id;
}

public List<Customer> getCustomers() {
	return customers;
}

public void setCustomers(List<Customer> customers) {
	this.customers = customers;
}

public ShopOwner getShopowner() {
	return shopowner;
}

public void setShopowner(ShopOwner shopowner) {
	this.shopowner = shopowner;
}

public int getShop_Id() {
	return shop_Id;
}

public void setShop_Id(int shop_Id) {
	this.shop_Id = shop_Id;
}

public List<Employee> getShopEmployees_Id() {
	return shopEmployees_Id;
}

public void setShopEmployees_Id(List<Employee> shopEmployees_Id) {
	this.shopEmployees_Id = shopEmployees_Id;
}

public String getShopName() {
	return shopName;
}

public void setShopName(String shopName) {
	this.shopName = shopName;
}

public Lease getLeaseStatus() {
	return leaseStatus;
}

public void setLeaseStatus(Lease leaseStatus) {
	this.leaseStatus = leaseStatus;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}


}