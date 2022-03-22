package com.cg.smms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mallAdmin")
public class MallAdmin {
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@OneToOne(mappedBy="malladmin")
	private User user;
	
	@Column(name="phone")
	private long phone;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public MallAdmin(long id, String name, String password, Mall mall, long phone) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.user = user;
		this.phone = phone;
	}

	public MallAdmin() {
		
	}

	@Override
	public String toString() {
		return "MallAdmin [id=" + id + ", name=" + name + ", password=" + password + ", mall=" + user + ", phone="
				+ phone + "]";
	}
	
	
}