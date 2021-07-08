package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Office\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		driver.manage().window().maximize();		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[1]")));
		driver.findElement(By.xpath("/html/frameset/frame[2]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[2]")));
		
		System.out.println(driver.findElement(By.id("content")).getText());
	}

}
