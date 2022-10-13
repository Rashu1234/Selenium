package common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class utilities {
  public WebDriver driver;
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rashu\\\\eclipse-workspace\\\\project.selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // instance 
		driver.get("https://www.facebook.com/");
		Thread.sleep(6000);
		driver.navigate ().refresh ();
		driver.manage ().window().maximize ();
  }

  @AfterClass
  public void afterClass() {
  }

}
