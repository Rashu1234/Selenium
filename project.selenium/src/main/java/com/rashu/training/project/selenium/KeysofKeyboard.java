package com.rashu.training.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysofKeyboard {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver","C:\\Users\\rashu\\eclipse-workspace\\project.selenium\\Driver\\chromedriver.exe");
			
		  
		  
			 driver=new ChromeDriver();
			driver.get("https://www.amazon.com");
			Thread.sleep(6000);
			
			driver.manage().window().maximize();
			Thread.sleep(6000);
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Computer");
		Actions ob=new Actions (driver);
		
		ob.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		ob.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		ob.keyUp(Keys.CONTROL);
		
		
		
		
		
	}

}
