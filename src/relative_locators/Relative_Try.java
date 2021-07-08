package relative_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;


public class Relative_Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Office\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement Relative = driver.findElement(By.xpath("//*[@name='name']"));
		
		System.out.println(driver.findElement(withTagName("label").above(Relative)).getText());
	
		WebElement bday = driver.findElement(By.xpath("//*[text()='Date of Birth']"));
		
		driver.findElement(withTagName("input").below(bday)).sendKeys("13/07/1996");
		
	}

}
