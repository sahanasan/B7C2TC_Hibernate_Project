package com.cg.smms.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@OneToOne
	@JoinColumn(name = "item_id")
	private Shop shop;

	@Column(name = "id")
	private int id;

	@Column(name = "itemName")
	private String itemName;

	@Column(name = "price")
	private double price;

	@Column(name = "manufacturingDate")
	private String manufacturingDate; // LocalDate manufacturingDate;

	@Column(name = "expiry")
	private String expiry; // LocalDate expiry

	private enum category {
		CLOTHING, MOBILES, ACCESSIORIES
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Item(int id, String itemName, double price, String manufacturingDate, String expiry, Shop shop) {

		this.id = id;
		this.itemName = itemName;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
		this.expiry = expiry;
		this.shop = shop;
	}

	public Item() {

	}

	@Override
	public String toString() {
		return "Item [shop=" + shop + ", id=" + id + ", itemName=" + itemName + ", price=" + price
				+ ", manufacturingDate=" + manufacturingDate + ", expiry=" + expiry + "]";
	}

}

