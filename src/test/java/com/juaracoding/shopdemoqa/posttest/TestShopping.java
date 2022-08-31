package com.juaracoding.shopdemoqa.posttest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.juaracoding.shopdemoqa.driversingleton.DriverSingleton;
import com.juaracoding.shopdemoqa.posttest24.PlaceOrder;
import com.juaracoding.shopdemoqa.posttest24.Search;
import com.juaracoding.shopdemoqa.utils.Constant;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class TestShopping {

	public static WebDriver  driver;
	private Search search;
	private PlaceOrder placeOrder;
	
	@Before
	public void setup() {
		DriverSingleton.getInstance(Constant .CHROME);
		search = new Search();
		placeOrder = new PlaceOrder();
		
	}
	
	@Given("^user navigate to web page$")
	public void navigate_login() {
		driver = DriverSingleton.getDriver();
		driver.get(Constant.URLPostTest);
	}
	
	@When("^search \"([^\"]*)\" item")
	public void search(String item) {
		search.searchItem(item);
	}
	
	@And("^add \"([^\"]*)\" item$")
	public void addFirstItem(String item) {
		placeOrder.detailProduct(item);
		placeOrder.checkOut();
	}
	
	@When("^user filling billing detail$")
	public void inputBillingDetail() {
		placeOrder.billingDetails();
		placeOrder.terms();
	}
	
	@And("^user place order$")
	public void placeOrder() {
		placeOrder.placeOrder();
	}
	
	@Then("^validate \"([^\"]*)\" scenario$")
	public void validate(String isValid) {
		if (isValid.equalsIgnoreCase(isValid)) {
			String actual = placeOrder.getSuccessMessage();
			assertTrue(actual.contains("Your order has been received"));
		}
	}
	
	
	static void delay(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
