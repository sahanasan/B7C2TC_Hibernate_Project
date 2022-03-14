package com.cg.smms.repositry;

import javax.persistence.EntityManager;

import com.cg.smms.entities.MallAdmin;


public class IMallAdminRepositoryImpl implements IMallAdminRepository{
	
	private EntityManager entityManager;
	
	public IMallAdminRepositoryImpl() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public MallAdmin addMallAdmin(MallAdmin mallAdmin) {
		entityManager.persist(mallAdmin);
		return mallAdmin;
	}

	@Override
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin) {
		entityManager.merge(mallAdmin);
		return mallAdmin;
	}

	@Override
	public void deleteMallAdmin(int id) {
		MallAdmin MallAdmin=entityManager.find(null, entityManager);
		entityManager.remove(MallAdmin);
		
	}

	@Override
	public void searchMallAdmin(int id) {
		entityManager.find(null, entityManager);
		
	}

	@Override
	public void commitTranscation() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTranscation() {
		entityManager.getTransaction().begin();
		
	}
}
	

	