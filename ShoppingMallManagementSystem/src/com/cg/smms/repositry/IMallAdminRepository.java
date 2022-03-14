package com.cg.smms.repositry;

import com.cg.smms.entities.MallAdmin;

public interface IMallAdminRepository {
	public abstract MallAdmin  addMallAdmin(MallAdmin mallAdmin);
	
	public  abstract MallAdmin  updateMallAdmin(MallAdmin mallAdmin);
	
	public abstract void deleteMallAdmin(int id);
	
	public abstract void searchMallAdmin(int id);
	
	public abstract void commitTranscation();
	
	public abstract void beginTranscation();
}