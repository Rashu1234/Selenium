package com.rashu.training.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserSetup {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver","C:\\Users\\rashu\\eclipse-workspace\\project.selenium\\Driver\\msedgedriver.exe");
driver=new EdgeDriver();		
Thread.sleep(6000);
driver.get("https://www.facebook.com/");	

Thread.sleep(6000);
driver.navigate ().refresh ();
driver.manage().window ().maximize ();

String titles=driver.findElement(By.xpath("//*[contains(text (),'Connect with friends')]")).getText();

System.out.println(titles);

public static void Screenshots () {
	((TakesScreenshot)d)
}


		
		
		
		
	}
	private static void Screenshots() {
		// TODO Auto-generated method stub
		
	}

}
