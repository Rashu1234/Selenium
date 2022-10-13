package Amazon_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
@FindBy(linkText="Kindle Books") WebElement kb;

public void KindleBooksClick ()
{
	kb.click();
}
public Home (WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
}

