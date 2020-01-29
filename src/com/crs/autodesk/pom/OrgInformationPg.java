package com.crs.autodesk.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgInformationPg 
{
	WebDriver driver;
    @FindBy (id="dtlview_Organization Name")
    private WebElement actorgname;
    
    public OrgInformationPg(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this );
	}

	public WebElement getActorgname() {
		return actorgname;
	}


}
