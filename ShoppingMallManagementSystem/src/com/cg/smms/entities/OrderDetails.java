package com.cg.smms.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
     
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer_id;
	
	@Column(name="shop")
     private Shop shop_id;

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
		return this.customer_id;
	}

	public void setCustomer(Customer customer) {
		this.customer_id = customer;
	}

	public Shop getShop() {
		return this.shop_id;
	}

	public void setShop(Shop shop) {
		this.shop_id = shop;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
	
}
