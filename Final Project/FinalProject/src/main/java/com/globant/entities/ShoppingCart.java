package com.globant.entities;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ShoppingCart")
public class ShoppingCart {
	
	@Id
	private String id;
	
	private Collection<Product> products;
	
	public ShoppingCart(){
		products = new ArrayList<Product>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Collection<Product> getProducts() {
		return products;
	}

	public void setProducts(Collection<Product> products) {
		this.products = products;
	}
	
	public void addProduct(Product product){
		products.add(product);
	}
	
	@Override
	public String toString(){
		String cart = "Cart contents: \n";
		for (Product element : products){
			cart+=element.getName()+"\n";
		}
		cart+="\nTotal products: "+products.size();
		return cart;
	}

}
