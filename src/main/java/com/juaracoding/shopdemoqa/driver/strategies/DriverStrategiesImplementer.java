package com.juaracoding.shopdemoqa.driver.strategies;

import com.juaracoding.shopdemoqa.utils.Constant;

public class DriverStrategiesImplementer {

	public static DriverStrategis chooseStrategis(String strategis) {
		switch (strategis) {
		case Constant.CHROME:
			return new Chrome();
			
		case Constant.FIREFOX:
			return new Firefox();
			
		default:
			return null;
		}
		
	}
	
}
