package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Try {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Office\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("Hello");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Password");
		//driver.findElement(By.cssSelector("div._6ltg")).click();
	    driver.findElement(By.cssSelector("div._6ltj")).click();
	    driver.manage().window().maximize();
	    driver.close();
	}
	
}
