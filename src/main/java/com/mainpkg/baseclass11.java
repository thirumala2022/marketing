package com.mainpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass11 {
	public  WebDriver driver;
	public void baseclass11() {
		 WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		  driver.get("https://mvnrepository.com/");
		  driver.manage().window().maximize();
	}

}
