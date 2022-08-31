package com.juaracoding.shopdemoqa.driver.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategis {

	public WebDriver setStrategis() {
		System.setProperty("webdriver.chrome.driver", "D:\\Bahan Juara Coding\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--no-sandbox");
		
		return new ChromeDriver(options);
	}
}
