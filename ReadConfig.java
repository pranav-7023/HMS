package Testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;            //declare object ie properties class ie already present in java
	
	String path = "C:\\Users\\hp\\Downloads\\Selenium2\\Project\\src\\test\\java\\Testng\\config.properties";      //create variable ie path and type is string      // to read data used path
	public ReadConfig()            //created constructor
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}                                           //take a class fis and pass 1 parameter ie path nad this class used for input
		
		public String getURL()
		{
			String url = pro.getProperty("url");        //created a method and pass a parameter
			
			return url;
		}
		
		public String getUsername()
		{
			String username = pro.getProperty("username");
					
		    return username;
		}
		
		public String getPassword()
		{
			String password = pro.getProperty("password");
			
			return password;
		}

	}


