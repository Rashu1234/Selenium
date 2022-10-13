package com.rashu.training.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiuonsToControl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rashu\\eclipse-workspace\\project.selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		
		WebElement Signed = driver.findElement (By.id("nav-link-accountList-nav-line-1"));
		Actions act= new Actions (driver);
		Thread.sleep(6000);
		
		
		
		
		
	}

}
