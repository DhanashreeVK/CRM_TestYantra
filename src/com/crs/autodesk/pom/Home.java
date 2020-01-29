package com.crs.autodesk.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crs.autodesk.pom.CampaignPage;
import com.crs.autodesk.pom.Organization;

public class Home 
{
	 WebDriver driver;
		@FindBy(linkText="Organizations")
		private WebElement orglink;
		
		@FindBy (xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement logoutimg; 
		
		@FindBy (linkText="Sign Out")
		private WebElement logoutbutton;
		
		@FindBy (xpath="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[22]/a")
		private WebElement moreopt;
		
		@FindBy (name="Campaigns")
		private WebElement camplink;
		
		@FindBy (linkText="Contacts")
		private WebElement contactlink;
		
		
		
		public Home(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public WebElement getcamplink() 
		{
			return camplink;
		}
		
		public WebElement getcontactlink() 
		{
			return contactlink;
		}
		
		public WebElement getmoreopt() 
		{
			return moreopt;
		}

		public WebElement getlogoutbutton() 
		{
			return logoutbutton;
		}
		
		public WebElement getOrglink() 
		{
			return orglink;
		}
		
		public WebElement getlogoutimg() 
		{
			return logoutimg;
		}
		
		public void selectCamp()
		{
			moreopt.click();
			camplink.click();
			CampaignPage camp=new CampaignPage(driver);
			camp.getAddcamplink().click();
		}
		
		public Organization navigateToOrg()
		{
			getOrglink().click();
			Organization org=new Organization(driver);
			return org;
		}
		
		public void logout()
		{
			/*GenericVtiger generic=new GenericVtiger();
			generic.mouseOverAction(getlogoutimg(), driver);*/
			getlogoutimg().click();
			getlogoutbutton().click();
			
		}


}
