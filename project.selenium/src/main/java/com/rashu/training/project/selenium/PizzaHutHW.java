package com.rashu.training.project.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PizzaHutHW {
	
	public void navigate () {
		
	}
  
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rashu\\\\eclipse-workspace\\\\project.selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // instance 
		driver.get("https://www.pizzahut.com/");
		
		driver.navigate ().refresh ();
		driver.manage ().window().maximize ();
		Thread.sleep(6000);
		
		driver.findElement(By.id("menu")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@data-testid=\"link-menu-pizza-link\"]")).click();  
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@data-testid=\"arrow-cheese-pizza\"]")).click();
	    Thread.sleep(6000);
	    driver.findElement (By.xpath("//*[@fill=\"#E71316\"]")).click();
	    driver.findElement (By.xpath("//*[@data-testid=\"delivery-occasion-tab\"]")).click();
	    driver.findElement(By.id("w2-address")).sendKeys("Omnia");
		driver.findElement(By.xpath("//*[@placeholder=\"Apt/Ste\"]")).sendKeys("641");
		driver.findElement(By.id("w2-city")).sendKeys("Lawrenceville");
		driver.findElement(By.id("w2-state")).sendKeys("GA");
		driver.findElement(By.id("w2-zip")).sendKeys("30044");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-testid=\"search\"] ")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()=\"SWITCH TO CARRYOUT\"]")).click();
		driver.findElement(By.id("carryout-city-state-zip")).sendKeys("30044");
		driver.findElement(By.xpath("//*[@data-testid=\"search\"] ")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()=\"Continue\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-testid=\"arrow-cheese-pizza\"]")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[text()='Choose your crust type and size']")).click();
		driver.findElement(By.xpath("//*[text()=\"Large\"]")).click();
	
		
		
		
		
	}

}
