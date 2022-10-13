package TestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Amazon_pages.Books;
import Amazon_pages.Home;
import Amazon_pages.StopOver;
import common.utilities;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class books extends utilities   {
	WebDriver driver;
  @Test
  public void f() {
 Home home=new Home(driver);
 home.KindleBooksClick();
 String url=driver.getCurrentUrl();
 System.out.println(url);
 System.out.println("this is before assert");
 SoftAssert sk=new SoftAssert ();
 sk.assertEquals(url, "https://www.amazon.com/kindle-dbs/storefront?storeType=browse&node=154606011");
 
 System.out.println("this is after assert");
 sk.assertAll();
 
 int linked = driver.findElements(By.tagName("a")).size();
 
 
 Books book= new Books(driver);
 book.stopover();
 StopOver stopover= new StopOver(driver); 
 stopover.ReadListenClick();
  }

  @AfterClass
  public void afterClass() {
  }

}
