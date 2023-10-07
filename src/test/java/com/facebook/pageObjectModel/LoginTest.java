package com.facebook.pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;//instance variable
	LoginPage loginpage;//building has a relationship with Login page
	@BeforeMethod//annotation
	public void openApp() {//method
		WebDriverManager.chromedriver().setup();//bonigarcia
		driver=new ChromeDriver();//initialization of instance variable of driver
		driver.manage().window().maximize();//manage method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//manage method
		driver.get("https://www.facebook.com/");//get method
		
		
	}
	@Test(priority=1)//1st priority annotation=Emergency call which requires immediate response
public void validLoginTest() {
		loginpage=new LoginPage(driver);//creating instance 
		loginpage.userName("sunon");//calling from loginpage class
		loginpage.password("jj");
		loginpage.clickloginButton();
	}
	@Test(priority=2)//2nd priority annotation=Emergency call which requires 2nd immediate response
	public void invalidLoginTest() {
			loginpage=new LoginPage(driver);
			loginpage.userName("sunona");
			loginpage.password("kk");
			loginpage.clickloginButton();
		}
}
