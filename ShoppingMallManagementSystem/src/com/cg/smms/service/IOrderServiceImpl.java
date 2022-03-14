package com.cg.smms.service;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.OrderDetails;
import com.cg.smms.repositry.ICustomerRepositoryImpl;
import com.cg.smms.repositry.IOrderRepository;
import com.cg.smms.repositry.IOrderRepositoryImpl;

public class IOrderServiceImpl  implements IOrderService{
	
	private IOrderRepository repository;

	public IOrderServiceImpl() {
		repository=new IOrderRepositoryImpl();
	}

	@Override
	public OrderDetails addOrder(OrderDetails order) {
		repository.beginTransaction();
		
		repository.commitTransaction();

		return null;
	}

	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		repository.beginTransaction();
		
		repository.commitTransaction();

		return null;
	}

	@Override
	public OrderDetails searchOrder(long id) {
		repository.beginTransaction();
		
		repository.commitTransaction();

		return null;
	}

	@Override
	public boolean cancelMall(long id) {
		repository.beginTransaction();
		
		repository.commitTransaction();

		return false;
	}

	@Override
	public Item addItem(Item item) {
		repository.beginTransaction();
		
		repository.commitTransaction();

		return null;
	}
	

}
