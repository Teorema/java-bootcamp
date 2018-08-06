package com.globant.app;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.globant.entities.Product;
import com.globant.entities.ShoppingCart;
import com.globant.entities.User;

import io.swagger.annotations.ApiOperation;

@Controller
public class ApiController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ShoppingCartRepository cartRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	/**
	 * User that is currently log in the system
	 */
	private User userLogged;
	
	/**
	 * Returns all users in the repository
	 * @return
	 */
	@RequestMapping(value="/getUsers", method=RequestMethod.GET)
	@ApiOperation(value="Finds all users", nickname="Get all users")
	public @ResponseBody Collection<User> getUsers(){
		return userRepository.findAll();
	}
	
	/**
	 * GET method for the user creation
	 * @param model
	 * @return
	 */
	@GetMapping("/addUser")
	@ApiOperation(value="Add a new user", nickname="Add user")
	public String registerForm(Model model){
		model.addAttribute("User", new User());
		return "addUser";
	}
	
	/**
	 * POST method for the user creation
	 * @param user
	 * @param model
	 * @return
	 */
	@PostMapping("/addUser")
	@ApiOperation(value="Add a new user", nickname="Add user")
	public String register(@ModelAttribute User user, Model model){
		User usernameInUse = userRepository.findByUsername(user.getUsername());
		if (usernameInUse != null){
			final String errorMessage = "Username already in use";
			model.addAttribute("errorMessage", errorMessage);
			model.addAttribute("User", new User());
			return "addUser";
		}
		else{
			User newUser = new User();
			newUser.setId(user.getUsername());
			newUser.setUsername(user.getUsername());
			newUser.setPassword(user.getPassword());
			userRepository.save(newUser);
			return "redirect:/";
		}
	}
	
	/**
	 * GET method for the login system
	 * @param model
	 * @return
	 */
	@GetMapping("/login")
	@ApiOperation(value="Login a user to the system", nickname="Login")
	public String login(Model model){
		model.addAttribute("User", new User());
		return "login";
	}
	
	/**
	 * POST method for the login system
	 * @param user
	 * @param model
	 * @return
	 */
	@PostMapping("/login")
	@ApiOperation(value="Login a user to the system", nickname="Login")
	public String loginResult(@ModelAttribute User user, Model model){
		User userExists = userRepository.findByUsername(user.getUsername());
		if (userExists == null){
			final String usernameError = "Username not found";
			model.addAttribute("usernameError", usernameError);
			model.addAttribute("passwordError", null);
			model.addAttribute("User", new User());
			return "login";
		}
		else{
			if (userExists.getPassword().equals(user.getPassword())){
				if (userExists.getCart() == null){
					ShoppingCart cart = new ShoppingCart();
					cart.setId(user.getUsername());
					user.setCart(cart);
					cartRepository.save(cart);
					userRepository.delete(userExists);
					userRepository.save(user);
				}
				model.addAttribute("loginUserCart", userExists.getCart());
				model.addAttribute("loginUser", userExists);
				userLogged = userExists;
				return "userMenu";
			}
			else{
				final String passwordError = "Invalid password";
				model.addAttribute("passwordError", passwordError);
				model.addAttribute("usernameError", null);
				model.addAttribute("User", new User());
				return "login";
			}
		}
	}
	
	/**
	 * Method for log out of the system
	 * @param model
	 * @return
	 */
	@GetMapping("/logout")
	@ApiOperation(value="Logs out a user from the system", nickname="Logout")
	public String logoutUser(Model model){
		model.addAttribute("User", new User());
		model.addAttribute("loginUser", false);
		model.addAttribute("loginUserCart", null);
		userRepository.delete(userLogged);
		userRepository.save(userLogged);
		return "redirect:/";
	}
	
	/**
	 * Returns all Shopping Carts in the repository
	 * @return
	 */
	@RequestMapping(value="/getCarts", method=RequestMethod.GET)
	@ApiOperation(value="Gets all shopping carts", nickname="Get Carts")
	@ResponseBody
	public Collection<ShoppingCart> getCarts(){
		return cartRepository.findAll();
	}
	
	/**
	 * Returns current user Shopping Cart information
	 * @return
	 */
	@GetMapping("/getCart")
	@ApiOperation(value="Get current user's shopping cart", nickname="Get Cart")
	@ResponseBody
	public String getCart(){
		return userLogged.getCart().toString();
	}

	/**
	 * Checks the total price for the products in the user's shopping cart
	 * @return
	 */
	@RequestMapping("/buyProducts")
	@ApiOperation(value="Get total price of the shopping cart", nickname="Buy Products")
	@ResponseBody
	public String finalizeShopping(){
		Double total = 0.0;
		for (Product element : userLogged.getCart().getProducts())
			total+=element.getPrice();
		return "The final amount to pay is "+total;
	}
	
	/**
	 * Adds a product to the user's shopping cart
	 * @param productId
	 * @param model
	 * @return
	 */
	@RequestMapping("/addToCart")
	@ApiOperation(value="Adds a product to the cart", nickname="Add Product")
	public String addToCart(@RequestParam(value="id") Integer productId, Model model){
		ShoppingCart loginUserCart = userLogged.getCart();
		loginUserCart.addProduct(productRepository.findById(productId).get());
		return "userMenu";
	}
	
	/**
	 * Returns all the Products in the repository
	 * @return
	 */
	@RequestMapping(value="/getProducts", method=RequestMethod.GET)
	@ApiOperation(value="Gets all products", nickname="Get Products")
	@ResponseBody
	public Collection<Product> getProducts(){
		return productRepository.findAll();
	}
	
	/**
	 * Adds a product to the repository
	 * @param id
	 * @param name
	 * @param description
	 * @param category
	 * @param price
	 */
	@RequestMapping("/addProduct")
	@ApiOperation(value="Adds a new product", nickname="Add Product")
	public void addProduct(@RequestParam(value="id", required=true) Integer id,
			@RequestParam(value="name", required=true) String name,
			@RequestParam(value="description") String description,
			@RequestParam(value="category", required=true) int category,
			@RequestParam(value="price", required=true) double price){
		Product product = new Product();
		product.setCategory(category);
		product.setId(id);
		product.setDescription(description);
		product.setName(name);
		product.setPrice(price);
		productRepository.save(product);
	}
	
	/**
	 * GET method that finds all the Products that belong to a category
	 * @param model
	 * @return
	 */
	@GetMapping("/findByCategory")
	@ApiOperation(value="Finds products of certain category", nickname="Find by Category")
	public String findByCategory(Model model){
		model.addAttribute("product", new Product());
		return "findCategory";
	}
	
	/**
	 * POST method that finds all the Products that belong to a category
	 * @param product
	 * @param model
	 * @return
	 */
	@PostMapping("/findByCategory")
	@ApiOperation(value="Finds products of certain category", nickname="Find by Category")
	public String findByCategoryResult(@ModelAttribute Product product, Model model){
		Collection<Product> result = productRepository.findByCategory(product.getCategory());
		if (result.isEmpty()){
			final String errorMessage = "No products found";
			model.addAttribute("errorMessage", errorMessage);
			model.addAttribute("product", new Product());
			return "findCategory";
		}
		else{
			final int cantProducts = result.size();
			model.addAttribute("cantProducts", cantProducts);
			model.addAttribute("products", result);
			model.addAttribute("product", new Product());
			return "findCategory";
		}
	}
	
	/**
	 * GET method that finds all the Products that have a certain name
	 * @param model
	 * @return
	 */
	@GetMapping("/findByName")
	@ApiOperation(value="Finds products of certain name", nickname="Find by Name")
	public String findByName(Model model){
		model.addAttribute("product", new Product());
		return "findName";
	}
	
	/**
	 * POST method that finds all the Products that have a certain name
	 * @param product
	 * @param model
	 * @return
	 */
	@PostMapping("/findByName")
	@ApiOperation(value="Finds products of certain name", nickname="Find by Name")
	public String findByNameResult(@ModelAttribute Product product, Model model){
		Collection<Product> result = productRepository.findByName(product.getName());
		if (result.isEmpty()){
			final String errorMessage = "No products found";
			model.addAttribute("errorMessage", errorMessage);
			model.addAttribute("product", new Product());
			return "findName";
		}
		else{
			final int cantProducts = result.size();
			model.addAttribute("cantProducts", cantProducts);
			model.addAttribute("products", result);
			model.addAttribute("product", new Product());
			return "findName";
		}
	}

}
