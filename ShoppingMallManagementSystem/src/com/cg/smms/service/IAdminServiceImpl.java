package com.cg.smms.service;

import com.cg.smms.entities.MallAdmin;
import com.cg.smms.repositry.IMallAdminRepository;
import com.cg.smms.repositry.IMallAdminRepositoryImpl;
import com.cg.smms.service.IAdminService;

public class IAdminServiceImpl implements IAdminService {
	
	private IMallAdminRepository repo;
	
	public IAdminServiceImpl() {
		repo=new IMallAdminRepositoryImpl();
	}

	@Override
	public void addMallAdmin(MallAdmin mallAdmin) {
		repo.beginTranscation();
		repo.addMallAdmin(mallAdmin);
		repo.commitTranscation();
		
	}

	@Override
	public void updateMallAdmin(MallAdmin mallAdmin) {
	  repo.beginTranscation();
	  repo.updateMallAdmin(mallAdmin);
	  repo.commitTranscation();
		
	}

	@Override
	public void deleteMallAdmin(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchMallAdmin(int id) {
		repo.beginTranscation();
		repo.searchMallAdmin(id);
		repo.commitTranscation();
		
		
	}
}
	