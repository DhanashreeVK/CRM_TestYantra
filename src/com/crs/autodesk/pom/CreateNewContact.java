package com.crs.autodesk.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewContact
{
	@FindBy (name="lastname")
	private WebElement lastname;
	
	@FindBy (xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebutton;

	public WebElement getLastname()
	{
		return lastname;
	}


}
