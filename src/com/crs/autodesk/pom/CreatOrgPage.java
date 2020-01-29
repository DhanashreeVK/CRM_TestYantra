package com.crs.autodesk.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.autodesk.generic.GenericVtiger;

public class CreatOrgPage 
{
	  WebDriver driver;
	    
	  @FindBy(name="accountname")
		private WebElement orgName;
		
	  
	@FindBy(id="phone")
	    private WebElement contacNumber;
	
	@FindBy(id="email1")
	private WebElement email ;
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement addmenberlink;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebutton;
	@FindBy (id="search_txt")
	private WebElement searchbox;
	@FindBy (name="search_field")
	private WebElement selectbox;
	@FindBy (xpath="//input[@type='button']")
	private WebElement serchbutton;
	@FindBy (xpath="//*[@id='1']")
	private WebElement membersearched;
	
	
	public WebElement getsavebutton() {
		return savebutton;
	}
	
	
	public WebElement getorgName() {
		return orgName;
	}
	
	
	public WebElement getcontacNumber() {
		return contacNumber;
	}
	
	
	public WebElement getEmail() {
		return email;
	}


public WebElement getAddmenberlink() {
	return addmenberlink;
}




public CreatOrgPage(WebDriver driver)
{	
	this.driver=driver;
	PageFactory.initElements(driver,this );
}


    public void addOrganizatioInfo(String orgname,String pnoneNum,String emailid ) 
    {
    	orgName.sendKeys(orgname);
    	contacNumber.sendKeys(pnoneNum);
    	email.sendKeys(emailid);
    	savebutton.click();
    	
    }
    
    public void addOrganizatioInfo(String orgname) 
    {
    	GenericVtiger generic=new GenericVtiger();
    	orgName.sendKeys(orgname+generic.getRandomNumber());
        savebutton.click();	
    }
    
    
    public void addOrganizatioInfo(String orgname, String member) 
    {
    	GenericVtiger generic=new GenericVtiger();
    	orgName.sendKeys(orgname+generic.getRandomNumber());
    	addmenberlink.click();  	
    	generic.switchToChildWindow(driver);
    	searchbox.sendKeys(member);   
    	Select s=new Select(selectbox);
		s.selectByVisibleText("Organization Name");
		serchbutton.click();
		membersearched.click();
		driver.switchTo().alert().accept();
		generic.switchToParentWindow(driver);
        savebutton.click();
    	
    }
    

    public void addOrganizatioInfo(String orgname,String pnoneNum,String emailid, String member ) 
    {
    	GenericVtiger generic=new GenericVtiger();
    	 
    	orgName.sendKeys(orgname+generic.getRandomNumber());
    	contacNumber.sendKeys(pnoneNum+generic.getRandomNumber());
    	email.sendKeys(emailid);
    	addmenberlink.click();  	
    	generic.switchToChildWindow(driver);
    	searchbox.sendKeys(member);   
    	Select s=new Select(selectbox);
		s.selectByVisibleText("Organization Name");
		serchbutton.click();
		membersearched.click();
		driver.switchTo().alert().accept();
		generic.switchToParentWindow(driver);
		savebutton.click();
		
		
    }


}
