package com.cg.smms.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import java.util.List;
@Entity
@Table(name = "Customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    //
	private int id;
    
	@Column(name="name")
	private String name;


	@ManyToOne
	@JoinColumn(name = "customers")
	private Shop customers;
	
	 @OneToMany(mappedBy="id",cascade=CascadeType.ALL)	
	 private List<OrderDetails> order_id;
     

	@Column(name = "phone")
	private int phone; // long phone;

	@Column(name = "email")
	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private User uid;

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

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public Customer(int id, String name, Shop customers, List<OrderDetails> order_id, int phone, String email,
			User uid) {
		super();
		this.id = id;
		this.name = name;
		this.customers = customers;
		this.order_id = order_id;
		this.phone = phone;
		this.email = email;
		this.uid = uid;
	}

	public Customer() {

	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", customers=" + customers + ", order_id=" + order_id
				+ ", phone=" + phone + ", email=" + email + ", uid=" + uid + "]";
	}

	

}
