package child_window;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Window_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Office\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.className("blinkingText")).click();
	    Actions A1 = new Actions(driver);
		driver.manage().window().maximize();
	
		Set<String> S1=driver.getWindowHandles();
         
		Iterator<String>SI=S1.iterator();
		
		String Parent_ID = SI.next();
		String Child_ID = SI.next();
	
		driver.switchTo().window(Child_ID);
	    System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
		
	    String Email_id = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split("with")[0].trim();
	     
	    driver.switchTo().window(Parent_ID);
	    
	    driver.findElement(By.id("username")).sendKeys(Email_id);
	
	    WebElement staticdropdown = driver.findElement(By.cssSelector("select.form-control"));
	    		
	    Select dropdown= new Select(staticdropdown);
	
	    dropdown.selectByIndex(2);
	}

}
