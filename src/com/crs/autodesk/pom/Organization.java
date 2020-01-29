package com.crs.autodesk.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crs.autodesk.pom.CreatOrgPage;

public class Organization
{
	WebDriver driver;
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement addlink;
		
	
	public Organization(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAddlink()
	{
		return addlink;
	}
	
	public CreatOrgPage navigateToCreatOrg()
	{
		getAddlink().click();
		CreatOrgPage crtorg=new CreatOrgPage(driver);
		return crtorg;
		
		
	}



}
