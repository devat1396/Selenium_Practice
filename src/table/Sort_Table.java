package table;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sort_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Office\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr//th[1]")).click();

		List<WebElement>items=driver.findElements(By.xpath("//tr//td[1]"));

		//items.stream().forEach(s->s.getText());
		List<String>vegies=items.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String>fruits=vegies.stream().sorted().collect(Collectors.toList());
		
		
	
		
	
	//	Iterator<WebElement> vegies= items.iterator();
		
//		while(vegies.hasNext())
//		{		
//		
//			String v=vegies.next().getText();
//		    
//			
//		}
	}

}
