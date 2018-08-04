package com.globant.services;

import java.util.Collection;

import com.globant.model.Product;
import com.globant.model.ShoppingCart;

public interface ShoppingCartService {
	
	public Collection<ShoppingCart> getCarts();
	
	public void addShoppingCart(ShoppingCart cart);
	
	public void deleteShoppingCart(ShoppingCart cart);
	
	public ShoppingCart getShoppingCart(int id);
	
	public void addProductShoppingCart(int id, Product product);
	public void removeProductShoppingCart(int id, Product product);
	
	public boolean validateShoppingCart(int id);

}
