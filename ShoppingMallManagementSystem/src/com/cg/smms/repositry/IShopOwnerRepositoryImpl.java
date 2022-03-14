package com.cg.smms.repositry;

import javax.persistence.EntityManager;

import com.cg.smms.entities.ShopOwner;

public class IShopOwnerRepositoryImpl implements  IShopOwnerRepository 
{
	private EntityManager entityManager;
	public IShopOwnerRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}
	

	@Override
	public ShopOwner addShopOwner(ShopOwner shopOwner) {
		entityManager.persist(shopOwner);
		return null;
	}

	@Override
	public ShopOwner updateShopOwner(ShopOwner shopOwner) {
	entityManager.merge(shopOwner);
		return null;
	}

	@Override
	public ShopOwner searchShopOwner(long id) {
		return null;
	}

	@Override
	public ShopOwner deleteShopOwner(long id) {
		entityManager.remove(entityManager);
		return null;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}
