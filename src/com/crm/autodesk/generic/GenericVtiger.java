package com.crm.autodesk.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.crm.autodesk.generic.GenericVtiger;
import com.crs.autodesk.pom.Home;


	public class GenericVtiger 
	{
		
		public Workbook wb;
		public Sheet sheet;
		public WebDriver driver;
		public Home hom;
		
		
		
		/**
		 * it will switch focus from parent to child window
		 * @param driver
		 */
		public void switchToChildWindow(WebDriver driver)
		{
			Set<String> set = driver.getWindowHandles();
			Iterator <String> it=set.iterator();
			String parent_window=it.next();
			String child_window=it.next();
			driver.switchTo().window(child_window);
		}

		/**
		 * It will switch focus from child window to parent window
		 * @param driver
		 */

		public void switchToParentWindow(WebDriver driver)
		{
			Set<String> set = driver.getWindowHandles();
			Iterator <String> it=set.iterator();
			String parent_window=it.next();
			driver.switchTo().window(parent_window);
		}
		
		/**
		 * It waits for 20 seconds.
		 * @param element
		 * @throws Throwable
		 */

		public void ElementClickIfVisible( WebElement element ) throws Throwable
		{
			int count=0;
			while (count<=20)
			{

				try
				{
					element.click();
					break;
				}
				catch(Throwable a)
				{
					Thread.sleep(1000);
					count++;
				}
			}
		}
		/**
		 * This will featch the data from propertis file
		 * @throws IOException
		 */
		
		public String fetchDataFromPropertyFile(String key) throws IOException
		{
			FileInputStream file=new FileInputStream("./commandata.Properties");
			Properties p=new Properties();
			p.load(file);

			String value =p.getProperty(key);
			System.out.println(value);
			return value;			
		}
		/**
		 * This method opens excelsheet
		 * @throws IOException 
		 */
		
		public String getExcelData(String sheetname, int row,int cell) throws IOException
		{
			GenericVtiger generic=new GenericVtiger(); 
			String path=generic.fetchDataFromPropertyFile("excepath");
			System.out.println(path);
			FileInputStream fil=new FileInputStream(path);
			Workbook wb= WorkbookFactory.create(fil);
			Sheet sheet = wb.getSheet(sheetname);
			  Row rownum = sheet.getRow(row);
			 Cell cellnumber = rownum.getCell(cell);
			  return (cellnumber.toString());
			  
		}
		
		
		public int getRandomNumber()
		{
			Random r=new Random();
			return (r.nextInt(1000));
		}
		
		public void mouseOverAction(WebElement element, WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.moveToElement(element).perform();
			
		}
		
		
			
		
		
	}



