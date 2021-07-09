package org.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass {
		
		public static WebDriver driver;
		public static Actions a;
		public static void BrowserLaunch() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selinium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
		
		public static void wait(int s) {
			driver.manage().timeouts().implicitlyWait(s, TimeUnit.SECONDS);
			
		}
		public static void launchUrl (String url) {
			driver.get(url);
			}
		
		public static void txtbox(WebElement f , String s) {
			f.sendKeys(s);
			
		}
		public static void clickbtn(WebElement s) {
			s.click();
			
		}
			
		public static void select(WebElement r, String o) {
				Select s = new Select(r);
				s.selectByVisibleText(o);
			}
			
		public static void getdata(WebElement x, int k, int y) throws IOException {
			File loc = new File("C:\\Users\\HP\\Desktop\\Book1.xlsx");
			FileInputStream st = new FileInputStream(loc);
			Workbook w = new XSSFWorkbook(st);
			Sheet sheet = w.getSheet("Sheet1");
			Row row = sheet.getRow(k);
			Cell cell = row.getCell(y);
			System.out.println(cell);
			int type = cell.getCellType();
			String value= null;
			if(type == 1)
			{
				String p = cell.getStringCellValue();
				x.sendKeys(p);
			}
			else {
				
				value= String.valueOf((long)cell.getNumericCellValue());
				x.sendKeys(value);
			}
		}
		public static void cydata (WebElement cv, int m, int n) throws IOException {
			
			String l= cv.getAttribute("value");
			System.out.println(l);
			File loc = new File("C:\\Users\\HP\\Desktop\\Book1.xlsx");
			FileInputStream st = new FileInputStream(loc);
			Workbook w = new XSSFWorkbook(st);
			Sheet sheet = w.getSheet("Sheet1");
			Row row = sheet.getRow(m);
			Cell cell = row.getCell(n);
			cell.setCellValue(l);
			FileOutputStream ot = new FileOutputStream(loc);
			w.write(ot);	
		}
		
			
		
		
		
		
		
		//public static String whandle() {
			//Set<String>allid=driver.getWindowHandles();
			//System.out.println(allid);
			//List<String>l= new LinkedList<String>();
			//l.addAll(allid);
			//String id =l.get(1);
			//driver.switchTo().window(id);
			//return id;
			
		//}
		
		//public static void pin(WebElement p, String ps, Keys enter) {
			
		//p.sendKeys(ps, enter);
			
		//}
		//public static void act(WebElement ad) {
		//	 a = new Actions(driver);
		//	a.moveToElement(ad).perform();
		//}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}



