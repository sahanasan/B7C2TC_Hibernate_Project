package com.cg.smms.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="order_details")
public class OrderDetails implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
    private int id;
	
	@Column(name="dateOfPurchase")
    private LocalDateTime dateOfPurchase;
	
	@Column(name="total")
    private float total;
	
	@Column(name="customers")
	private List<Customer>customers;
	
	
	private enum paymentMode{ CARD , CASH , UPI , ONLINEBANKING};
             
	@Column(name="customer")
	private Customer customer;
	
	@Column(name="shop")
     private Shop shop;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDateOfPurchase() {
		return this.dateOfPurchase;
	}

	public void setDateOfPurchase(LocalDateTime dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public float getTotal() {
		return this.total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public List<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Shop getShop() {
		return this.shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
	
}
