package com.globant.services;

import java.util.Collection;

import com.globant.model.Product;
import com.globant.model.ShoppingCart;
import com.globant.repository.ShoppingCartRepository;

public class ShoppingCartServiceImpl implements ShoppingCartService{
	
	private ShoppingCartRepository shoppingCartRepository;
	
	public ShoppingCartServiceImpl(){
		shoppingCartRepository = new ShoppingCartRepository();
	}

	@Override
	public Collection<ShoppingCart> getCarts() {
		return shoppingCartRepository.getCarts();
	}

	@Override
	public void addShoppingCart(ShoppingCart cart) {
		shoppingCartRepository.addShoppingCart(cart);
	}

	@Override
	public void deleteShoppingCart(ShoppingCart cart) {
		shoppingCartRepository.removeShoppingCart(cart);
	}

	@Override
	public ShoppingCart getShoppingCart(int id) {
		for (ShoppingCart element : shoppingCartRepository.getCarts())
			if (element.getId() == id)
				return element;
		return null;
	}

	@Override
	public void addProductShoppingCart(int id, Product product) {
		for (ShoppingCart element : shoppingCartRepository.getCarts())
			if (element.getId() == id){
				element.addProduct(product);
				return;
			}
	}

	@Override
	public void removeProductShoppingCart(int id, Product product) {
		for (ShoppingCart element : shoppingCartRepository.getCarts())
			if (element.getId() == id){
				element.removeProduct(product);
				return;
			}
	}

	@Override
	public boolean validateShoppingCart(int id) {
		for (ShoppingCart element : shoppingCartRepository.getCarts()){
			if (element.getId() == id)
				return true;
		}
		return false;
	}

}
