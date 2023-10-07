package com.facebook.pageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestName {
	WebDriver driver;
	String userName="email";
	String password="pass";
	String loginButton="login";
	
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
	}
	public WebElement findbyId(String name) {
		return driver.findElement(By.name(name));
	}
	
	@Test
	public void boundaryLogintest() {
		findbyId(userName).sendKeys("tanita");
		findbyId(password).sendKeys("lkkl");
		findbyId(loginButton).click();
	
	}

}
