package com.facebook.pom_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginpageWithPageFactory {
	WebDriver driver;

	public LoginpageWithPageFactory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="email") WebElement userNameId;
	public WebElement uNameMethod(String enterYourUsername) {
		userNameId.sendKeys(enterYourUsername);
		return userNameId;
		
	}
	
	@FindBy(how=How.NAME,using="pass") WebElement passLocator;
	public WebElement passMethod(String enterYourPassword) {
		passLocator.sendKeys(enterYourPassword);
		return passLocator;
		
	}
	@FindBy(how=How.XPATH, using="//button[starts-with(@id,'u_0_5_')]") private WebElement loginLocator; 
public void loginButton() {
	loginLocator.click();
}
	
		
		
	}
	
	


