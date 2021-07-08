package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

public class JS_Pop_ups {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Office\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Devanshu");

		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();

		// Radio button

		driver.findElement(By.xpath("//input[@value='radio2']")).click();

		driver.findElement(By.id("autocomplete")).sendKeys("Ind");

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		List<WebElement> drop = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"] //*[@id=\"ui-id-3\"]"));

		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		for (WebElement option : drop) {

			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		// driver.findElement(By.id("autocomplete"));

	}

}
