package com.testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mainpkg.baseclass11;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage{
	WebDriver driver;
	@BeforeTest
	public void baseClas()
	{
		 WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
	}
	
	
  @Test
  public void Login() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement eltEmail= driver.findElement(By.id("email"));
		
		
		
		eltEmail.sendKeys("thirumala.kiran85@gmail.com");
		
  }
  

}
