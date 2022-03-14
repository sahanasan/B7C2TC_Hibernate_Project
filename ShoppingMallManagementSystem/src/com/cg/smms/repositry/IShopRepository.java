package com.cg.smms.repositry;

import com.cg.smms.entities.Shop;

public interface IShopRepository {
	public Shop addShop(Shop shop);
	public Shop updateShop(Shop shop);
	public Shop searchShopById(long id);
	public boolean deleteShop(long id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
