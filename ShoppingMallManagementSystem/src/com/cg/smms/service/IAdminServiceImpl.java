package com.cg.smms.service;

import com.cg.smms.entities.MallAdmin;
import com.cg.smms.entities.Shop;
import com.cg.smms.entities.User;
import com.cg.smms.repositry.IMallAdminRepository;
import com.cg.smms.repositry.IMallAdminRepositoryImpl;
import com.cg.smms.service.IAdminService;

public class IAdminServiceImpl implements IAdminService {
	
	private IMallAdminRepository repository;
	
	public IAdminServiceImpl() {
		repository=new IMallAdminRepositoryImpl();
	}

	@Override
	public boolean approveNewShop(Shop shop) {
		repository.beginTransaction();
		repository.commitTransaction();
		return false;
	}

	@Override
	public User updateUser(User user) {
		repository.beginTransaction();
		repository.commitTransaction();
		return null;
	}

	@Override
	public User login(User user) {
		repository.beginTransaction();
		repository.commitTransaction();
		return null;
	}

	@Override
	public boolean logOut() {
		repository.beginTransaction();
		repository.commitTransaction();
		return false;
	}
}


	