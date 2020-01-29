package com.crs.autodesk.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addConlink 
{
	@FindBy (xpath="//img[@title='Create Contact...']")
	private WebElement addconlink;

	public WebElement getAddconlink() {
		return addconlink;
	}
	

}
