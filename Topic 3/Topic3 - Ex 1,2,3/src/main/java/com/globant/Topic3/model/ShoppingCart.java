package com.globant.Topic3.model;

import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Product> products;
	
	public ShoppingCart(){
		products = new ArrayList<Product>();
	}
	
	public ArrayList<Product> getProducts(){
		return products;
	}
	
	public void setProducts(ArrayList<Product> products){
		this.products = products;
	}
	
	public void addProduct(Product product){
		products.add(product);
	}
	
	public void removeProduct(Product product){
		if (products.contains(product))
			products.remove(product);
	}
	
	public Double getTotalPrice(){
		Double Total = 0.0;
		for (Product product : products){
			Total += product.getPrice();
		}
		return Total;
	}
}
