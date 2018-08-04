package com.globant.model;

import java.util.ArrayList;

public class ShoppingCart {

	private int id;
	private ArrayList<Product> products;
	
	public ShoppingCart(int id) {
		this.id = id;
		this.products = new ArrayList<Product>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void addProduct(Product product){
		products.add(product);
	}
	
	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	
	public void removeProduct(Product product){
		products.remove(product);
	}
	
}
