package drag_drop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Office\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
       
		Actions A1= new Actions(driver);
 
		
		driver.get("https://jqueryui.com/droppable/");

		driver.manage().window().maximize();
		driver.findElement(By.className("demo-frame")).click();

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		driver.findElement(By.id("draggable")).click();

		WebElement drop = driver.findElement(By.id("droppable"));
		WebElement drag = driver.findElement(By.id("draggable"));
		
		A1.dragAndDrop(drag,drop).build().perform();
		  driver.switchTo().defaultContent();


	}

}
