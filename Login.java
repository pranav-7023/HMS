package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	static WebDriver driver;                 //directly access method and variable
	
	@BeforeClass
	public void setup()
	{
        WebDriverManager.chromedriver().setup();
		
        ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);  // launch the browser0
		
		driver.manage().window().maximize();
		
		driver.get("https://project1.qualibytes.com/backend/admin/index.php"); //
		
	}
	
	
	@Test
	public void loginTest()
	{
        WebDriverManager.chromedriver().setup();
		
        ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);  // launch the browser0
		
		driver.manage().window().maximize();
		
		driver.get("https://project1.qualibytes.com/backend/admin/index.php"); //
		
		/*driver.findElement(By.name("ad_email")).sendKeys("admin@mail.com");  // inspecting email address //element located and also performed method together
		
		driver.findElement(By.name("ad_pwd")).sendKeys("Password@123");   // inspecting password
		
		driver.findElement(By.name("admin_login")).click();     //inspecting logging button */
		
		PageObjectLogin pg = new PageObjectLogin(driver);     //declare object              //for realtime scenario
		
		pg.setUsername("admin@mail.com");         //called method setusername and pass string value
		
		pg.setPassword("Password@123");
		
		pg.Click();
		
		
		
		
		
		// All value is hardcoded//  for real time scenario created a file
		
	}

}
