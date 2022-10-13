package com.rashu.training.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\rashu\\eclipse-workspace\\project.selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");	
		
		Thread.sleep(6000);
		driver.navigate ().refresh ();
		driver.manage().window ().maximize ();
	
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(6000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(6000);
		driver.switchTo().alert().accept ();
		driver.findElement(By.id("confiremButton")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().dismiss ();
		driver.findElement(By.id("promButton")).click();
		
		
		
		
		
		
		
	}

}
