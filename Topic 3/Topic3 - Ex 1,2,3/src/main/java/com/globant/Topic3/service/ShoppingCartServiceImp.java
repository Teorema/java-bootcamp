package com.globant.Topic3.service;

import java.util.ArrayList;

import com.globant.Topic3.model.Product;
import com.globant.Topic3.model.ShoppingCart;

/**
 * Represents a very simple implementation of the different
 * services of a shopping cart
 */
public class ShoppingCartServiceImp implements ShoppingCartService{

	/**
	 * A new instance of a shopping cart element
	 */
	ShoppingCart cart = new ShoppingCart();
	
	/**
	 * An empty constructor
	 */
	public ShoppingCartServiceImp(){
	}
	
	/**
	 * Adds a product to the cart
	 * @param product An instance of a product element
	 */
	public void addProduct(Product product){
		if (product != null)
			cart.addProduct(product);
	}

	/**
	 * Removes a product to the cart
	 * @param product An instance of a product element
	 */
	public void removeProduct(Product product){
		if (product != null)
			cart.removeProduct(product);
	}

	/**
	 * Obtains all the products within the cart
	 * @return the products
	 */
	public ArrayList<Product> getProducts(){
		return cart.getProducts();
	}

	/**
	 * Calculates the current total price of all the products
	 * @return the price
	 */
	public Double getTotalPrice(){
		return cart.getTotalPrice();
	}

}
