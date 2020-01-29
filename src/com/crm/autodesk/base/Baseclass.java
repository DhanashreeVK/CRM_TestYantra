package com.crm.autodesk.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.autodesk.generic.GenericVtiger;
import com.crs.autodesk.pom.Home;
import com.crs.autodesk.pom.VtigerCommercialOpen;

public class Baseclass 
{
	public WebDriver driver;
	public GenericVtiger generic;
	public VtigerCommercialOpen com;
	public Home hp;
    
	@BeforeClass
	public void Browser()
	{
		System.out.println("Launching browser......");
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		 driver=new ChromeDriver();

	}
	

	
	
	@BeforeMethod
	public void loginVtiger() throws IOException
	
	{  
		com=new VtigerCommercialOpen(driver);
		generic=new GenericVtiger();
		String url = generic.fetchDataFromPropertyFile("URL");
		String user = generic.fetchDataFromPropertyFile("username");
		String pass = generic.fetchDataFromPropertyFile("password");
		driver.get(url);
		
		com=new VtigerCommercialOpen(driver);
		
		com.loginVtiger(user,pass);
		 hp = new Home(driver);
		 
	}
	
	@AfterMethod
	public void logoutApp()
	{
		
		System.out.println("logout..");
		hp.logout();
		
		/*generic.mouseOverAction(hm.getlogoutimg(), driver);
		
		hm.getlogoutbutton().click();
*/	
		
	}
	

	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	


}
