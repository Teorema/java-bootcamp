package com.globant.app;

import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.globant.model.Product;
import com.globant.model.ShoppingCart;
import com.globant.services.ShoppingCartService;
import com.globant.services.ShoppingCartServiceImpl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/carts")
public class ShoppingCartController {

	private ShoppingCartService shoppingCartService = new ShoppingCartServiceImpl();
	
	@RequestMapping("/getCarts")
	@ApiOperation(value = "Finds all shopping carts", nickname = "Get all carts")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success") })
	public Collection<ShoppingCart> getUsers() {
		return shoppingCartService.getCarts();
	}
	
	@RequestMapping("getCart")
	@ApiOperation(value = "Finds a shopping cart with same id", nickname = "Get cart by id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success") })
	public ResponseEntity<?> getShoppingCartById(@RequestParam(value="id", required=true) int id){
		ShoppingCart cartfound = shoppingCartService.getShoppingCart(id);
		if (!(cartfound == null)){
			return new ResponseEntity<ShoppingCart>(cartfound, HttpStatus.OK);
		}
		else
			return new ResponseEntity<String>("Shopping Cart not found", HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping("/addCart")
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Adds a new shopping cart", nickname = "Add cart")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success") })
	public ResponseEntity<?> addShoppingCart(@RequestParam(value="id", required=true) int id){
		if (shoppingCartService.validateShoppingCart(id))
			return new ResponseEntity<String>("Shopping Cart already exists", HttpStatus.BAD_REQUEST);
		else{
			ShoppingCart cart = new ShoppingCart(id);
			shoppingCartService.addShoppingCart(cart);
			return new ResponseEntity<String>("Shopping Cart added successfully", HttpStatus.OK);
		}
	}
	
	@RequestMapping("/deleteCart")
	@ApiOperation(value = "Deletes a shopping cart", nickname = "Delete cart")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success") })
	public ResponseEntity<?> deleteShoppingCart(@RequestParam(value="id", required=true) int id){
		if (shoppingCartService.validateShoppingCart(id)){
			ShoppingCart cart = new ShoppingCart(id);
			shoppingCartService.deleteShoppingCart(cart);
			return new ResponseEntity<String>("Shopping Cart removed successfully", HttpStatus.OK);
		}
		else
			return new ResponseEntity<String>("Shopping Cart not found", HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping("/addProduct")
	@ApiOperation(value = "Adds a product to the shopping cart", nickname = "Add Product to Cart")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success") })
	public ResponseEntity<String> addProductToCart(@RequestParam(value="id", required=true) int id,
			@RequestParam(value="product", required=true) int productId){
		if (shoppingCartService.validateShoppingCart(id)){
			Product product = new Product(productId);
			shoppingCartService.addProductShoppingCart(id, product);
			return new ResponseEntity<String>("Product added successfully", HttpStatus.OK);
		}
		else
			return new ResponseEntity<String>("Shopping Cart not found", HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping("/removeProduct")
	@ApiOperation(value = "Removes a product from the shopping cart", nickname = "Remove Product from Cart")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success") })
	public ResponseEntity<String> removeProductFromCart(@RequestParam(value="id", required=true) int id,
			@RequestParam(value="product", required=true) int productId){
		if (shoppingCartService.validateShoppingCart(id)){
			Product product = new Product(productId);
			shoppingCartService.removeProductShoppingCart(id, product);
			return new ResponseEntity<String>("Product removed successfully", HttpStatus.OK);
		}
		else
			return new ResponseEntity<String>("Shopping Cart not found", HttpStatus.BAD_REQUEST);
	}
}
