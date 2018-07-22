package com.globant.Topic3.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.globant.Topic3.model.Product;

public class ShoppingCartServiceTest {
	
	private final ShoppingCartServiceImp cartImp = new ShoppingCartServiceImp();
	
	@Test
	public void addNewProductTest(){
		Product product = new Product("name", "description", 20.5);
		cartImp.addProduct(product);
		assertEquals(1, cartImp.getProducts().size());
	}
	
	@Test
	public void removeExistingProductTest(){
		Product product = new Product("name", "description", 20.5);
		cartImp.addProduct(product);
		cartImp.removeProduct(product);
		assertEquals(0, cartImp.getProducts().size());
	}
	
	@Test
	public void getProductListTest(){
		Product product1 = new Product("name1", "description1", 20.0);
		Product product2 = new Product("name2", "description2", 30.5);
		Product product3 = new Product("name3", "description3", 40.0);
		cartImp.addProduct(product1);
		cartImp.addProduct(product3);
		cartImp.addProduct(product2);
		ArrayList<Product> expectedResult = new ArrayList<Product>();
		expectedResult.add(product1);
		expectedResult.add(product3);
		expectedResult.add(product2);
		assertEquals(expectedResult, cartImp.getProducts());
	}

	@Test
	public void calculateTotalPriceTest(){
		Product product1 = new Product("name1", "description1", 20.0);
		Product product2 = new Product("name2", "description2", 30.5);
		Product product3 = new Product("name3", "description3", 40.0);
		cartImp.addProduct(product1);
		cartImp.addProduct(product2);
		cartImp.addProduct(product3);
		assertEquals(90.5, cartImp.getTotalPrice(), 0);
	}
}
