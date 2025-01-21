package com.iframedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeUsingNameAndID {
	
	static  WebDriver driver = null;
	 
	 public static void main(String[] args) {
		 
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
			driver = new ChromeDriver();
			
			driver.get("https://www.rediff.com/");
			
			driver.manage().window().maximize();
			

			driver.switchTo().frame("moneyiframe"); //here id and name is same
			
			
			
			driver.findElement(By.id("query")).sendKeys("Tata");
			
			driver.findElement(By.xpath("//input[@class='getqbtn']")).click();
				
			// handling iframe using string name
			
		
	}
	 

}



