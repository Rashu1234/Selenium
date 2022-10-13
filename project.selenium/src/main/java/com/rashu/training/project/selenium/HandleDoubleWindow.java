package com.rashu.training.project.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleDoubleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rashu\\\\eclipse-workspace\\\\project.selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // instance 
		driver.get("https://www.amazon.com/");
		
		driver.navigate ().refresh ();
		driver.manage ().window().maximize ();
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement kindlesj=driver.findElement(By.linkText("Kindle Books"));
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.SHIFT).build().perform();
		kindlesj.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		Set<String>windowsoi =driver.getWindowHandles();
		Iterator<String> iterator =windowsoi.iterator();
		String FirstWindowHandle = iterator.next();
		String SecondWindowHandle = iterator.next();
		driver.switchTo().window(SecondWindowHandle);
		System.out.println(FirstWindowHandle);
        System.out.println(SecondWindowHandle);
        
        Thread.sleep(6000);
		WebElement Stopover = driver.findElement(By.linkText("The Stopover"));
		Stopover.click();
		
		
		
		
		
	}

}
