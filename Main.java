package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {

	@Test
	public void testLogin() 
	{
		    WebDriverManager.chromedriver().setup();
		    
		    ChromeOptions options = new ChromeOptions();
			
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(options);   // launch the browser0
			
			driver.manage().window().maximize();
			
			ReadConfig config = new ReadConfig();                //created object of readconfig class
			
			driver.get(config.getURL());
			
			driver.findElement(By.name("ad_email")).sendKeys(config.getUsername());
			
			driver.findElement(By.name("ad_pwd")).sendKeys(config.getPassword());
	}
	
}


