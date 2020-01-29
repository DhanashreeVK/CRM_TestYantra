package com.crs.autodesk.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage  
{
			WebDriver driver;
		@FindBy (xpath="//img[@alt='Create Campaign...']")
		private WebElement addcamplink;

		public WebElement getAddcamplink() {
			return addcamplink;
		}
		
		public CampaignPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

	}



