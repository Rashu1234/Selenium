package com.rashu.training.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAC {
	

	public static void main(String[] args) throws InterruptedException {
		
		//Chrome Browser //elements locator 

		  String jk=System.getProperty("user.dir");
		  System.out.println(jk);
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rashu\\eclipse-workspace\\project.selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	/*Thread.sleep(6000);
	driver.navigate ().refresh ();
	driver.manage().window ().maximize ();
	Thread.sleep(6000);
	driver.navigate ().back();
	Thread.sleep(6000);
	driver.navigate ().forward();
	
	String windows=driver.getWindowHandle ();
    System.out.println(windows); 
	
    String url=driver.getCurrentUrl ();
    System.out.println(url);
	
    String titleP=driver.getTitle ();
    System.out.println(titleP);
	
 WebElement UserField=  driver.findElement(By.id("email"));
  UserField.sendKeys("rashu");
	WebElement PasswordField=driver.findElement(By.name("pass"));
   PasswordField.sendKeys("rash") ;
   /*WebElement LogButton=driver.findElement(By.name("login"));
   LogButton.click() ;*/
   
  /* WebElement Forgotit=driver.findElement(By.partialLinkText("Forgot password?"));
                       //driver.findElement(By.linkText("Forgot password?"))
   Forgotit.click();*/
    
  /*WebElement CreatAnAccount =driver.findElement(By.linkText("Create new account"));
   CreatAnAccount.click();
   Thread.sleep(6000);
   WebElement FirstnameTextBox =  driver.findElement(By.name("firstname"));
   FirstnameTextBox.sendKeys("Rakibul");
   WebElement LastnameTextBox = driver.findElement(By.name("lastname"));
   LastnameTextBox.sendKeys("Rashu");
   WebElement MobileTextBox = driver.findElement(By.name("reg_email__"));
   MobileTextBox.sendKeys("+14707061546");
   WebElement NewPassWord = driver.findElement(By.name("reg_passwd__"));
   NewPassWord.sendKeys("Rash@");
   
   WebElement Month=driver.findElement(By.name("birthday_month"));
   Select ob=new Select (Month);
   ob.selectByIndex(5);
   
   WebElement Day=driver.findElement(By.name("birthday_day"));
   Select bo=new Select (Day);
   bo.selectByValue("15");
   
   WebElement Year= driver.findElement(By.name("birthday_year"));
   Select dy= new Select (Year);
   dy.selectByValue ("1989");
   
   
   WebElement Toggles= driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[2]"));
   Toggles.click();
   
   WebElement SignUp = driver.findElement(By.xpath("(//button[@type='submit']) [2]"));
   SignUp.click();*/
 
   
	}

}
