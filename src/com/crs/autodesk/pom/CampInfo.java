package com.crs.autodesk.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampInfo 
{

		WebDriver driver;
		@FindBy(id="dtlview_Campaign Name")
		private WebElement cname;

		public WebElement getCname() {
			return cname;
		}
		
		public CampInfo(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		

	}


