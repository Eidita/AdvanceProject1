package com.facebook.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;//instance variable

	public LoginPage(WebDriver driver) {//constructor
		super();
		this.driver = driver;//these 2 lines default constructor
		PageFactory.initElements(driver, this);//pom design
	}
	
	public WebElement userName(String enterYourUserName) {//local variable
		//WebElement=dataType
		//userName=method name
		//it's return type method
	
		WebElement uName=driver.findElement(By.cssSelector("#email"));
		//uName=local variable
		//driver.findElement(By.cssSelector("#email")=value
		uName.sendKeys(enterYourUserName);
		return uName;
		//only use for one method calling
		
		
	}
	public WebElement password(String enterYourpassword) {//local variable
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("jhj");
		return pass;
		//only use for one method calling
		
	}
	public void clickloginButton() {//instance method
		
		//does not have any return type, that's why void
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		
	}
	public WebElement forgetPassword() {//local variable
		WebElement fPassword=driver.findElement(By.linkText("Forgot password?"));
		fPassword.click();
		return fPassword;
		//only use for one method calling
	}
	public WebElement createNewAccount() {//local variable
		WebElement newAccount =driver.findElement(By.linkText("Create new account"));
		newAccount.click();
		return newAccount;
		//only use for one method calling
	
	
	}
}
