package com.globant.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.globant.model.ShoppingCart;

public class ShoppingCartRepository {
	
	private Collection<ShoppingCart> carts;
	
	public ShoppingCartRepository(){
		carts = new ArrayList<ShoppingCart>();
	}
	
	public Collection<ShoppingCart> getCarts(){
		return carts;
	}
	
	public void addShoppingCart(ShoppingCart cart){
		carts.add(cart);
	}

	public void removeShoppingCart(ShoppingCart cart){
		carts.remove(cart);
	}
	
}
