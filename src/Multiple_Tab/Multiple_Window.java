package Multiple_Tab;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Window {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Office\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.switchTo().newWindow(WindowType.TAB); // To open new Tab
		
		Set<String> Win=driver.getWindowHandles();
	
		Iterator<String> Win_Id=Win.iterator();
		
		String Parent_Id=Win_Id.next();
		
		String Child_Id= Win_Id.next();
		
		driver.switchTo().window(Child_Id);
		
		driver.get("https://rahulshettyacademy.com/");
		
		
String name =driver.findElements(By.xpath("//a[contains(@href,'https://courses.rahulshettyacademy.com/p')]")).get(1).getText();

     driver.switchTo().window(Parent_Id);

		WebElement Relative = driver.findElement(By.xpath("//*[@name='name']"));

		Relative.sendKeys(name);
		
		File file=Relative.getScreenshotAs(OutputType.FILE); // Taking Screenshot of web-element
     
		FileUtils.copyFile(file, new File("logo.png"));  
		
     //		System.out.println(driver.findElement(withTagName("a").below(Relative)).getText());
     
        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
        FileUtils.copyFile(file1, new File("D://screenshot.png"));
        
	}

}
