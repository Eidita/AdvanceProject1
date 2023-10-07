package com.facebook.baseLoginTest;

import org.testng.annotations.Test;
import com.facebook.base.BaseTest;
import com.facebook.pom_pagefactory.LoginpageWithPageFactory;
import com.facebook.utilities.PropertiesReader;

public class LoginTest extends BaseTest{
	LoginpageWithPageFactory lpf;
	PropertiesReader propertiesReader;
	
	@Test
	public void validLoginTest() {
		propertiesReader=new PropertiesReader();
		lpf=new LoginpageWithPageFactory(driver);
		lpf.uNameMethod(propertiesReader.getUserName());
		lpf.passMethod(propertiesReader.getPassword());
		lpf.loginButton();
	}
	@Test
	public void closeApp() {
		if (driver != null) {
			driver.quit();
		
		}
	

	}}
