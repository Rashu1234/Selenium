package com.rashu.training.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rashu\\eclipse-workspace\\project.selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		
		Thread.sleep(6000);
		driver.navigate ().refresh ();
		driver.manage().window ().maximize ();
	
	   String titles=driver.findElement(By.xpath("//*[contains(text (),'Connect with friends')]")).getText();
		
		System.out.println(titles);
		
		
		
		
		
		
		
		
	}

}
