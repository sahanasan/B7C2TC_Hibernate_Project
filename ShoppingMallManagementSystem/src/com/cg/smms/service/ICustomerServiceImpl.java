package com.cg.smms.service;

import java.util.List;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.Mall;
import com.cg.smms.entities.OrderDetails;
import com.cg.smms.entities.User;
import com.cg.smms.repositry.ICustomerRepository;
import com.cg.smms.repositry.ICustomerRepositoryImpl;

public class ICustomerServiceImpl implements ICustomerService
{
	private ICustomerRepository repository;
	
	public ICustomerServiceImpl() {
		repository=new ICustomerRepositoryImpl();
		
	}

	@Override
	public List<Item> searchItem(String itemName) {
		repository.beginTransaction();

		
		repository.commitTransaction();
		
		return null;
	}
	@Override
	public Item orderItem(Item item) {
		repository.beginTransaction();
		//repository.orderItem(OrderDetails order);
		repository.commitTransaction();
		return null;
	}

	@Override
	public Mall searchMall(long id) {
		repository.beginTransaction();
		repository.commitTransaction();
		repository.searchCustomer(1);
		return null;
	}

	@Override
	public boolean cancelOrder(long orderId) {
		repository.beginTransaction();
		repository.commitTransaction();
		repository.deleteCustomer(0);
		return false;
	}

	@Override
	public User login(User user) {
		repository.beginTransaction();
		repository.commitTransaction();
		return null;
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		repository.beginTransaction();
		repository.commitTransaction();
		return false;
	}
	
}