package all;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class All_Sel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	    System.setProperty("webdriver.chrome.driver","C:\\Office\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.findElement(By.id("name")).sendKeys("Devanshu");

		driver.findElement(By.id("alertbtn")).click();
		
		driver.switchTo().alert().accept();
        
		WebElement static_dropdowns = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(static_dropdowns);
		
		dropdown.selectByValue("option2");
		
		driver.findElement(By.id("autocomplete")).sendKeys("In");
		driver.findElement(By.xpath("//*[contains(@class,'ui-menu')] //*[text()='India']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input")).click();
	
		driver.findElement(By.id("checkBoxOption2")).click();
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		
		driver.findElement(By.xpath("//*[@class='mouse-hover-content'] //*[text()='Reload']")).click();
	
		driver.findElement(By.xpath("//*[@id='courses-iframe']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='courses-iframe']")));
	
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[contains(text(),'Make a big')]")).getText());  // Not a frame
	
		
	
	}

}
