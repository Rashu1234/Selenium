package com.rashu.training.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragedLocator {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rashu\\eclipse-workspace\\project.selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");	
		Thread.sleep(6000);
		
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		WebElement dragedit = driver.findElement(By.id("draggable"));
		WebElement dropeds= driver.findElement (By.id ("droppable"));
		Actions act=new Actions (driver);
		act.dragAndDrop(dragedit, dropeds).perform();
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(6000);
		WebElement Resizeable = driver.findElement(By.linkText("Resizable"));
		Resizeable.click();
	
		
	}

}
