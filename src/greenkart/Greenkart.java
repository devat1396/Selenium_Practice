package greenkart;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Greenkart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Office\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String[] Items= {"Cauliflower","Cucumber"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		int i;

		for (i = 0; i < products.size(); i++) {

			String[] item_name = products.get(i).getText().split("-");
			String Formatted_name = item_name[0].trim();
			
			List Veg = Arrays.asList(Items);
			if(Veg.contains(Formatted_name))
			{
				//driver.findElement(By.cssSelector("a.increment")).click();
		//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/a[2]")).click(); // + symbol
		//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[3]/button")).click(); // add to cart
			
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			}

		}

		driver.findElement(By.className("cart-icon")).click();
		driver.findElement(By.className("action-block")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("PromoCode");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.className("promoBtn")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
		WebElement static_drop = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select"));
		Select dropdown= new Select(static_drop);
		
		dropdown.selectByValue("India");
		
		driver.findElement(By.className("chkAgree")).click();
	
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
	}

}
