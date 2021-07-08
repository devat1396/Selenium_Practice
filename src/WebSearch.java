import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSearch {

public static void main(String[] args) {
	
    System.setProperty("webdriver.chrome.driver","C:\\Office\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    
	driver.get("https://www.google.in/");
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());

   driver.findElement(By.name("q")).sendKeys("How to hower over dropdown menu in Selenium");
   driver.manage().window().maximize();
   driver.findElement(By.className("gNO89b")).submit();
   
  // Actions act = new Actions(driver);   
  //act.moveToElement(null) 
}

}
