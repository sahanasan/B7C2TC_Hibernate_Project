package com.cg.smms.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mall")
public class Mall {
	@Id
	@Column(name="id")
private long id;
	
	@Column(name="mallAdmin")
private MallAdmin mallAdmin;
	
	@Column(name="mallName")
private String mallName;
	
	@Column(name="location")
private String location;
	
	@Column(name="shops")
private List<Shop> shops;
private enum categories{
	REGIONAL,SUPERREGIONAL
}
 
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public MallAdmin getMallAdmin() {
	return mallAdmin;
}
public void setMallAdmin(MallAdmin mallAdmin) {
	this.mallAdmin = mallAdmin;
}
public String getMallName() {
	return mallName;
}
public void setMallName(String mallName) {
	this.mallName = mallName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public List<Shop> getShops() {
	return shops;
}
public void setShops(List<Shop> shops) {
	this.shops = shops;
}
public Mall(long id, MallAdmin mallAdmin, String mallName, String location, List<Shop> shops) {
	this.id = id;
	this.mallAdmin = mallAdmin;
	this.mallName = mallName;
	this.location = location;
	this.shops = shops;
}
public Mall() {
	
}
@Override
public String toString() {
	return "Mall [id=" + id + ", mallAdmin=" + mallAdmin + ", mallName=" + mallName + ", location=" + location
			+ ", shops=" + shops + "]";
};


}
