package com.juaracoding.shopdemoqa.driversingleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.juaracoding.shopdemoqa.driver.strategies.DriverStrategiesImplementer;
import com.juaracoding.shopdemoqa.driver.strategies.DriverStrategis;
import com.juaracoding.shopdemoqa.utils.Constant;



public class DriverSingleton {

		private static DriverSingleton instance = null;
		private static WebDriver driver;
		
		private DriverSingleton(String driver) {
			instantiate(driver);
		}
		
		public WebDriver instantiate(String strategis) {
			DriverStrategis driverStrategis = DriverStrategiesImplementer.chooseStrategis(strategis);
			driver = driverStrategis.setStrategis();
			driver.manage().timeouts().implicitlyWait(Constant.TIMEOUT, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			return driver;
		}
		
		public static DriverSingleton getInstance(String driver) {
			if( instance == null) {
				instance = new DriverSingleton(driver);
			}
			return instance;
		}
		
		public static WebDriver getDriver() {
			return driver;
		}

		public static void closeObjectInstance() {
	        instance = null;
	        driver.quit();
	    }

	
}
