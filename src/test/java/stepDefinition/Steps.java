package stepDefinition;

import java.util.List;

import java.lang.*;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class Steps {
	
	static WebDriver driver;	
	  
	    @Given("The user is in add customer page.")
	   public void the_user_is_in_add_customer_page() {
	       // Write code here that turns the phrase above into concrete actions
	    	System.setProperty("webdriver.chrome.driver","D:\\Cucumber\\Cucumber01\\driver\\chromedriver.exe");
	   	 driver = new ChromeDriver();
	   	driver.get("https://demo.guru99.com/telecom");
	   	    // Write code here that turns the phrase above into concrete actions
	   	    driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
	       	   }

	   @When("The user fills in the valid customer details")
	   public void the_user_fills_in_the_valid_customer_details(DataTable customerDetails) {
	       // Write code here that turns the phrase above into concrete actions
		//   List<String> CustomerList= customerDetails.asList(String.class);
		   driver.findElement(By.xpath("//label[text()='Done']"));
		   Map<String, String> CustomerMap = customerDetails.asMap(String.class, String.class);
		    driver.findElement(By.id("fname")).sendKeys(CustomerMap.get("fname"));
		    driver.findElement(By.id("lname")).sendKeys(CustomerMap.get("lname"));
		    driver.findElement(By.id("email")).sendKeys(CustomerMap.get("email"));
		    driver.findElement(By.name("addr")).sendKeys(CustomerMap.get("addr"));
		    driver.findElement(By.name("telephoneno")).sendKeys(CustomerMap.get("telephoneno"));
		}

	   

	   @When("The user clicks the submit button.")
	   public void the_user_clicks_the_submit_button() {
	       // Write code here that turns the phrase above into concrete actions
		   driver.findElement(By.name("submit")).click();
	       
	   }

	   @Then("The user shouid see the customer ID generated.")
	   public void the_user_shouid_see_the_customer_ID_generated() {
	       // Write code here that turns the phrase above into concrete actions
		   Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
	   }


}
