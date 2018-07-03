//Proxy class of Product

public class Product_Proxy {

	private Product element;
	
	public Product_Proxy(Product element){
		this.element = element;
	}
	
	public String getName(){
		return element.name;
	}
	
	public void setName(String name){
		element.name = name;
	}
	
	public String getDescription(){
		return element.description;
	}
	
	public void setDescription(String description){
		element.description = description;
	}
	
	public Double getPrice(){
		return element.price;
	}
	
	public void setPrice(Double price){
		element.price = price;
	}
	
}
