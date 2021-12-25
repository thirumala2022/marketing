package com.testpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusClass {
	WebDriver driver;
	@BeforeTest
	public void baseClas()
	{
		 WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	
  @Test
  public void Login() {
	 
	  WebElement eltEmail= driver.findElement(By.id("email"));	
		
		
			eltEmail.sendKeys("thirumala.kiran85@gmail.com");
  }
  @AfterTest
  public void exit()
  {
	  driver.quit();
  }

}
