package com.crm.autodesk.CampaignTest;

import org.testng.annotations.Test;

import com.crm.autodesk.base.Baseclass;
import com.crs.autodesk.pom.CreateNewCampaign;

public class CreateCampWithNameTest extends Baseclass
{
	@Test
	public void campaign() throws Throwable
{
	// step 2 : navigate to camp
         hp.selectCamp();
	
	// step 3 : navigate to create camp
	CreateNewCampaign crtcamp=new CreateNewCampaign(driver);
	
	// step 4 : Create camp 
	int rnum=generic.getRandomNumber();
	String campName = generic.getExcelData("Sheet2", 1, 0);
	crtcamp.campcreate(campName+rnum);


}
}
