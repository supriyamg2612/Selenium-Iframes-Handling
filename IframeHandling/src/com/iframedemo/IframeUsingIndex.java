package com.iframedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeUsingIndex {
	
	// iframe handling using index
	
	static  WebDriver driver = null;
	 
	 public static void main(String[] args) {
		 
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
			driver = new ChromeDriver();
			
			driver.get("https://ui.vision/demo/webtest/frames/");
			
			driver.manage().window().maximize();
			
			driver.switchTo().frame(0);
			
			driver.findElement(By.name("mytext1")).sendKeys("Selenium");
			
			// if there is only one frame or less than 3 then we can use this
			
		
	}
	 

}
