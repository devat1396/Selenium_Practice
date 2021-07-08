package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce_Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Office\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.findElement(By.cssSelector("a[rel='nofollow']")).click();
		driver.findElement(By.xpath("//*[@id=\"login\"]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Hello");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password");
        driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
	}

}
