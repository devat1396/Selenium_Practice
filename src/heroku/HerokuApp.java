package heroku;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Office\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String>S1= driver.getWindowHandles();
		
		Iterator<String>SI=S1.iterator();
		
		String Parent_ID=SI.next();
	 
		String Child_ID = SI.next();
        
		driver.switchTo().window(Child_ID);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(Parent_ID);
		
		System.out.println(driver.findElement(By.xpath("//*[text()='Opening a new window']")).getText());
		
	}

}
