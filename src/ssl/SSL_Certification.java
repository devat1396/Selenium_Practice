package ssl;

import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.HashSet;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.browser.Browser;
import org.openqa.selenium.devtools.browser.Browser.GetVersionResponse;



public class SSL_Certification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Command<GetVersionResponse> v = Browser.getVersion();
		String Version=v.toString();
		
		DesiredCapabilities ch= new DesiredCapabilities(BrowserType.CHROME,Version,Platform.WIN10);		
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Office\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);


	
	
	}

}
