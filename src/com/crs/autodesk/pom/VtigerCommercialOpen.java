package com.crs.autodesk.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerCommercialOpen 
{
	@FindBy(name="user_name")
	private WebElement uname;
	
	@FindBy(name="user_password")
	private WebElement pass;
	
	@FindBy(id="submitButton")
	private WebElement loginbutton;
	
	public VtigerCommercialOpen(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this );
	}
	
	
	
	public void loginVtiger(String user,String password)
	{
		
	     uname.sendKeys(user);
	     pass.sendKeys(password);
	     loginbutton.click();
	}

	
	


}
