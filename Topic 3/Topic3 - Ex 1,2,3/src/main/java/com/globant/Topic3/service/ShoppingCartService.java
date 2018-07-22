package com.globant.Topic3.service;

import java.util.ArrayList;

import com.globant.Topic3.model.Product;

public interface ShoppingCartService {
	
	//Add Product to the Shopping Cart
	void addProduct(Product product);
		
	//Remove existing Product from Shopping Cart
	void removeProduct(Product product);
		
	//View current Products in the Shopping Cart
	ArrayList<Product> getProducts();
		
	//Obtain total price
	Double getTotalPrice();

}
