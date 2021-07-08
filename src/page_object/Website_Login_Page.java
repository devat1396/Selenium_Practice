package page_object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Website_Login_Page {
  
	WebDriver driver;
	public Website_Login_Page(WebDriver driver)
	{
		this.driver=driver;
	}
  
	By search_bar = By.name("q");
	By go = By.name("btnK");
	
	public WebElement search_bar()
	{
		return driver.findElement(search_bar);
	}
	
	public WebElement google_search()
	{
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver.findElement(go);
	}

}
