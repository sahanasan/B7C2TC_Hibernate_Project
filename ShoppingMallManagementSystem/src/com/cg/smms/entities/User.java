package com.cg.smms.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="id")
private long id;
	 
	@Column(name="name")
private String name;
	
	@Column(name="type")	
private String type;
	
	@Column(name="password")
private String password;
	
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn (name="id")
	private MallAdmin mallAdmin;
	
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn (name="id")
	private List<OrderDetails> order_id;
    

	public User(long id, String name, String type, String password ) {
		
		this.id = id;
		this.name = name;
		this.type = type;
		this.password = password;
		this.order_id=order_id;
	}

	public User() {
		
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	
	}
	
	

	public List<OrderDetails> getOrder_id() {
		return order_id;
	}

	public void setOrder_id(List<OrderDetails> order_id) {
		this.order_id = order_id;
	}

	public MallAdmin getMallAdmin() {
		return mallAdmin;
	}

	public void setMallAdmin(MallAdmin mallAdmin) {
		this.mallAdmin = mallAdmin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", type=" + type + ", password=" + password + "]";
	}
	
	
}