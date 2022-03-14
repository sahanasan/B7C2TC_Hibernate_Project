package com.cg.smms.service;

import com.cg.smms.entities.User;
import com.cg.smms.repositry.IEmployeeRepository;
import com.cg.smms.repositry.IEmployeeRepositoryImpl;
import com.cg.smms.repositry.IUserRepository;
import com.cg.smms.repositry.IUserRepositoryImpl;

public class IUserServiceImpl implements IUserService{
	
	private IUserRepository repository;
	public IUserServiceImpl()
	{
		repository=new IUserRepositoryImpl();
	}

	@Override
	public User addUser(User user) {
        repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
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
