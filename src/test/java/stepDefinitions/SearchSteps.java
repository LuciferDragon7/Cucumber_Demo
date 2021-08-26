package stepDefinitions;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SearchSteps {
	
	Product product;
	Search search;
	
	@Given("I have a search field on Amazon")
	public void i_have_a_search_field_on_amazon() {
	    System.out.println("Step 1: I am on search page");
	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String ProductName, Integer price) {
	  System.out.println("Step 2: Search the product with name "+ ProductName + " price: "+ price);
	  
	  product = new Product(ProductName, price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String ProductName) {
	   System.out.println("Step 3: product "+ ProductName + " is displayed");
	   
	   search = new Search();
	   String name = search.displayProduct(product);
	   System.out.println("Searched product is : "+name);
	   Assert.assertEquals(product.getProductName(), name);
	}
	
	@Then("Order with price {int} andd username with {string} is displayed")
	public void order_with_price_andd_username_with_is_displayed(Integer int1, String string) {
	   
	}

}
