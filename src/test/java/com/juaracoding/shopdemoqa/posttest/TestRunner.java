package com.juaracoding.shopdemoqa.posttest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

 @CucumberOptions(tags = "",
		 		features="src/test/resources/1.Login.shop.demoqa.features/",
				glue="",
				plugin={"pretty","html:target/cucumber-reports.html"})
 
public class TestRunner extends AbstractTestNGCucumberTests{

 }
