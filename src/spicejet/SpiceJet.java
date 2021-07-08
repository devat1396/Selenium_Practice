package spicejet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Office\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); // For clicking on round trip
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); // For clicking on Departure
		
		//driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[8]/a")).click();
		
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click(); // For clicking on Arrival
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("(//a[@value='GOP'])[2]")).click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOP']")).click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticdropdown); // Selecting Currency dropdown from the webpage

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		dropdown.selectByVisibleText("USD");  // For changing the currency
	}

}
