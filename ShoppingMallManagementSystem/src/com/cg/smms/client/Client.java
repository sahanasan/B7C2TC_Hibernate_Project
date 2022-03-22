package com.cg.smms.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.smms.entities.Customer;
import com.cg.smms.entities.MallAdmin;
import com.cg.smms.entities.ShopOwner;
import com.cg.smms.entities.User;
import com.cg.smms.service.IAdminService;
import com.cg.smms.service.IAdminServiceImpl;
import com.cg.smms.service.ICustomerService;
import com.cg.smms.service.ICustomerServiceImpl;
import com.cg.smms.service.IShopService;
import com.cg.smms.service.IUserService;
import com.cg.smms.service.IUserServiceImpl;

public class Client {
	
	public static void main(String args[]) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create operation mallAdmin
		MallAdmin mallAdmin= new MallAdmin();
		mallAdmin.setName("sahana");
		mallAdmin.setPassword("fghyjnf");
		
		//create operation user
		User user =new User();
		user.setName("nithin");
		user.setType("mantri mall");
		user.setPassword("fytnkjgfg");
		 
		user.setMallAdmin(mallAdmin);
		mallAdmin.setUser(user);
		
		IUserService service = new IUserServiceImpl();
		service.addUser(user);
		
		Customer customer=new Customer();
		customer.setId(1);
		customer.setName("sobha");
		customer.setPhone(34567821);
		customer.setEmail("sobha@gmail");
		
		user.setOrder_id(null);
		customer.setId(102);
		
		ICustomerService c=new ICustomerServiceImpl();
		c.cancelOrder(1);
		
		ShopOwner ShopOwner = new ShopOwner();
		ShopOwner.setId(1);
		ShopOwner.setName("navya");
		//ShopOwner.setDob(2-1-2000);
		ShopOwner.setAddress("ambedkar colony");
		
		ShopOwner.setShop_id(null);
		
		
	}

}
