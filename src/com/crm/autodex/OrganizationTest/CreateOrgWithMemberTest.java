package com.crm.autodex.OrganizationTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.autodesk.base.Baseclass;

import com.crm.autodesk.generic.GenericVtiger;
import com.crs.autodesk.pom.CreatOrgPage;
import com.crs.autodesk.pom.Home;
import com.crs.autodesk.pom.OrgInformationPg;
import com.crs.autodesk.pom.Organization;

	public class CreateOrgWithMemberTest extends Baseclass 
	{

		@Test
		public void test() throws IOException, Throwable
		{
			
			GenericVtiger g=new GenericVtiger();
			GenericVtiger generic=new GenericVtiger();
			String orgName = g.getExcelData("Sheet1", 1, 0);
			String phone = g.getExcelData("Sheet1", 1, 1);
			String mail = g.getExcelData("Sheet1", 1, 2);
			String memName = g.getExcelData("Sheet1", 1, 3);
			
			
			// step 2 : navigate to org
			Home h=new Home(driver);
			Organization org=h.navigateToOrg();
			
			// step 3 : navigate to create org		
			CreatOrgPage crtOrg = org.navigateToCreatOrg();
		    
			// step 4 : create org
			crtOrg.addOrganizatioInfo(orgName, phone, mail, memName);
			 OrgInformationPg orginfo=new OrgInformationPg(driver);
			 
			 // step 5 : verification
			 Thread.sleep(1000);
			 String actualOname=orginfo.getActorgname().getText();
			Assert.assertEquals(actualOname, orgName);
		}
	}



