package page_object_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page_object.Website_Login_Page;

public class Loginapplication {
  
	@Test
  public void Login() {

	  System.setProperty("webdriver.chrome.driver", "C:\\Office\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();

	  driver.get("https://www.google.in/");
	  Website_Login_Page s= new Website_Login_Page(driver);
	  
	  s.search_bar().sendKeys("Page Object Model");
       
	  s.google_search().click();
	  
	  
  }
}
