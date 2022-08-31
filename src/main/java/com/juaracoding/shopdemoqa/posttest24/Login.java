package com.juaracoding.shopdemoqa.posttest24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.shopdemoqa.driversingleton.DriverSingleton;


public class Login {

	private WebDriver driver;
	
	public Login() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='rememberme']")
	private WebElement btnRemember;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//div[@id='primary']//li[1]")
	private WebElement invalidMessage;
	
	@FindBy(xpath="//*[@id=\"post-8\"]/div/div/div/p[2]")
	private WebElement validMessage;

	public void login(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
	}
	public void clickLogin() {
		btnRemember.click();
		btnLogin.click();
	}
	
	public String validate(String isValid) {
		if (isValid.equalsIgnoreCase("valid")) {
			return validMessage.getText();
		} else if (isValid.equalsIgnoreCase("invalid")) {
			return invalidMessage.getText();
		}else {
			return null;
		}
}	
	
}
