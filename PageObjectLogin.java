package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectLogin {       //used for design pattern   //this is reference class
	
	WebDriver ldriver;   // declare WebDriver object which is local driver
	
	public PageObjectLogin(WebDriver rdriver)   // declare constructor and passed one parameter remote driver
	{
		ldriver = rdriver;            // inside this constructor  under local driver rdriver initialized
		PageFactory.initElements(rdriver, this);   //called init method 
	}
	
	@FindBy(id="emailaddress")           //to find elements used @Findby annotation and given attribute id 
	WebElement userName;                 //when identify elements, return value which is webelement and store it in a variable ie usrname
	
	@FindBy(id="password")              // same thing in this also
	WebElement pass;                     // under this variable its particular elements address is stored
	
	@FindBy(name="admin_login")            //same here
	WebElement button;
	
	public void setUsername(String uname)     //call method setusername and accept one parameter ie string name   for performing operation
    {
   	 userName.sendKeys(uname);          //  used username variable and sendkeys method to send data ie uname
    }
    
    public void setPassword(String pwd)      //same  for performing operation
    {
   	 pass.sendKeys(pwd);
    }
    
    
    public void Click()                          //called method click
    {
   	 button.click();
    }
}
