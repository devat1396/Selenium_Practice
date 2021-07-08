package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Office\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
		driver.findElement(By.cssSelector("input#autosuggest")).sendKeys("US");  // For autosuggestive dropdown

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
        List <WebElement> Autodrop = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); // For autosuggestive dropdown

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        
        for(WebElement option : Autodrop)
        {
        	if(option.getText().equalsIgnoreCase("United States (USA)"))  // For autosuggestive dropdown
        	{
        		option.click();  
        		break;
        	}
        }
		
		/*
		WebElement StaticDrop = driver.findElement(By.cssSelector("input#autosuggest"));
				
        Select dropdown = new Select(StaticDrop);
        */
		
        driver.findElement(By.id("divpaxinfo")).click();  // For Number of Passengers
        
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    	 
        for(int i=1;i<3;i++)
        {	  
              driver.findElement(By.id("hrefIncAdt")).click(); // For Number of Passengers
             
        }    
      

		driver.findElement(By.cssSelector("input[id *='IndArm']")).click();

		
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();  // One way round trip or multicity
        
        driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();// For Origin location
        driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[6]/a")).click();
        
        
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();  // For destination location     
      //  driver.findElement(By.xpath("(//a[@value='GOP']) [2]")).click();
        
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOP']")).click();
		
       
        
	}

}
