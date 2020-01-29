package com.crs.autodesk.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.autodesk.generic.GenericVtiger;

public class CreateNewCampaign
{
	public WebDriver driver;
	@FindBy (name="campaignname")
	private WebElement campname;
	
	@FindBy (xpath="//img[@title='Select']")
	private WebElement addproductlink;
	
	@FindBy (xpath="//a[@id='1']")
	private WebElement product;
	
	@FindBy (xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement savebutton;
	
	public CreateNewCampaign(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	public WebElement getCampname() {
		return campname;
	}


	public WebElement getAddproductlink() {
		return addproductlink;
	}
	
	public WebElement getProduct() {
		return product;
	}
	
	public WebElement getSavebutton()
	{
		return savebutton;
	}
	
	public void campcreate(String newcampname) throws Throwable
	{
		campname.sendKeys(newcampname);
		/*addproductlink.click();
		GenericVtiger generic=new GenericVtiger();
		generic.switchToChildWindow(driver);
		product.click();
		generic.ElementClickIfVisible(savebutton);
		generic.switchToParentWindow(driver);*/
		savebutton.click();
		
		
	}
	
	public void campcreateProduct(String newcampname) throws Throwable
	{
		campname.sendKeys(newcampname);
		addproductlink.click();
		GenericVtiger generic=new GenericVtiger();
		generic.switchToChildWindow(driver);
		product.click();
		generic.ElementClickIfVisible(savebutton);
		generic.switchToParentWindow(driver);
		savebutton.click();
		
		
	}

	

}
