package com.iframedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeUsingWebElement {
	
	static WebDriver driver = null;
 
	 
	 public static void main(String[] args) {
		 
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
			driver = new ChromeDriver();
			
			driver.get("https://ui.vision/demo/webtest/frames/");
			
			driver.manage().window().maximize();
			
			// if there are multiple iframes then using webelement method
			
			WebElement iframe1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));  //use selector hub for xpath
			driver.switchTo().frame(iframe1);
			driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Frame One");
			driver.switchTo().defaultContent();
			
			WebElement iframe2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
			driver.switchTo().frame(iframe2);
			driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Frame 2");
			driver.switchTo().defaultContent();
			
			WebElement iframe4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
			driver.switchTo().frame(iframe4);
			driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Frame 4");
			driver.switchTo().defaultContent();
			
			WebElement iframe3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
			driver.switchTo().frame(iframe3);
			driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Frame 3");
			
			driver.switchTo().frame(0);
			
			System.out.println("we are in inner frame of frame 3");
			
			driver.findElement(By.xpath("//label[@for='i9']//div[@class='bzfPab wFGF8']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='Web Testing']")).click();
			driver.findElement(By.xpath("//div[@class='MocG8c HZ3kWc mhLiyf LMgvRb KKjvXb DEh1R']")).click();
			
			driver.switchTo().defaultContent();
			

			WebElement iframe5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
			driver.switchTo().frame(iframe5);
			driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Frame 5");

			
			
			
			
	 }			

}
