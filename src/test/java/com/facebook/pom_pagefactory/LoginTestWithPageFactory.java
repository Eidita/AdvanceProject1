package com.facebook.pom_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestWithPageFactory {
WebDriver driver;
LoginpageWithPageFactory lpf;

@BeforeMethod
public void openApp() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
}
@Test
public void validLogin() {
	lpf=new LoginpageWithPageFactory(driver);
	lpf.uNameMethod("nurul");
	lpf.passMethod("ds");
	lpf.loginButton();
}
}
