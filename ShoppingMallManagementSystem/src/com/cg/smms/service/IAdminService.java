package com.cg.smms.service;

import com.cg.smms.entities.MallAdmin;

public interface IAdminService {
public abstract void  addMallAdmin(MallAdmin mallAdmin);
	
	public abstract void updateMallAdmin(MallAdmin mallAdmin);
	
	public abstract void deleteMallAdmin(int id);
	
	public abstract void searchMallAdmin(int id);

}
