package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Try {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Office\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("iphone XR");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-logo-sprites")).click();
		
		Actions A1 = new Actions(driver);
		
		A1.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform(); // Hover

		driver.findElement(By.className("nav-action-inner")).click(); // click on sign in
		
	}
}
