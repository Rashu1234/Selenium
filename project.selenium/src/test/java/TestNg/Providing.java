package TestNg;

import org.testng.annotations.Test;

import Facebook.Home;
import common.utilities;

import org.testng.annotations.DataProvider;

public class Providing extends utilities {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	Home home=new Home (driver);
	home.FieldToEmail(n);
	Thread.sleep(6000);  
	home.PasswToField(s);  
	Thread.sleep(6000);   
	home.loginbtclick(); 
	Thread.sleep(6000);
	driver.navigate().back();
	 
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"tested", "p1" },
      new Object[] { "tested2", "p2" },
      new Object[] { "tested3", "p3" },
    };
    
  }
}
