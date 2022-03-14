package com.cg.smms.client;

import com.cg.smms.entities.Customer;
import com.cg.smms.entities.MallAdmin;
import com.cg.smms.entities.User;
import com.cg.smms.service.IAdminService;
import com.cg.smms.service.IAdminServiceImpl;

public class Client {
	
	public static void main(String args[]) {
		
		//create operation mallAdmin
		MallAdmin mallAdmin= new MallAdmin();
		mallAdmin.setName("sahana");
		mallAdmin.setPassword("fghyjnf");
		
		//create operation user
		User user =new User();
		user.setName("nithin");
		user.setType("mantri mall");
		user.setPassword("fytnkjgfg");
		 
		user.setMall(null);
		mallAdmin.getMall();
		
		IAdminService service = new IAdminServiceImpl();
		service.addMallAdmin(mallAdmin);
		
		//create operation customer
		Customer customer =new Customer();
		customer.setId(1);
		customer.setName("sushma");
		customer.setEmail("sushma@123");
		customer.setPhone(345678219);
		customer.setOrders("book product");
		
		customer.getEmail();
		customer.getName();
		customer.getId();
		customer.getOrders();
		customer.getPhone();
		
	}

}
