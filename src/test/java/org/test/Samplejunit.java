package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;


public class Samplejunit extends BaseClass {
	public static JunitLocators j;
	@BeforeClass
		public static void beforeClass() {
		BrowserLaunch();
		wait(50);
		driver.manage().window().maximize();
		System.out.println("before class");
	}
	@AfterClass
		public static void afterClass() {
		System.out.println("after class");
	
	}
	@Before
		public void before() {
		System.out.println("Before");
	}
	@After
		public void after() {
		System.out.println("After");
	}
	@Test
		public void test() {
		launchUrl("https://adactinhotelapp.com/");
		 j = new JunitLocators();
		txtbox(j.getUsrnm(), "aravindhancr");
		txtbox(j.getPswd(), "784512");
		clickbtn(j.getLog());
		select(j.getLoc(), "London");
		select(j.getHotel(), "Hotel Hervey");
		select(j.getRoom(), "Super Deluxe");
		select(j.getnoRooms(), "2 - Two");
		clickbtn(j.getbtnSearch());
		clickbtn(j.getbtnRadio());
		clickbtn(j.getbtnContin());
		System.out.println("Test 1");
	}
	@Test
		public void test2() throws IOException, InterruptedException {
		
		getdata(j.getfName(), 1, 0);
		getdata(j.getLname(), 1, 1);
		getdata(j.getAddrs(), 1, 2);
		getdata(j.getCcno(), 1, 3);
		select(j.getCctype(), "Master Card");
		select(j.getXpmonth(), "April");
		select(j.getXpyr(), "2022");
		getdata(j.getCv(), 1, 4);
		clickbtn(j.getBook());
		Thread.sleep(5000);
		cydata(j.getorId(), 1, 5);
		
		
		
		
	}
	
	@Ignore
	@Test
	public void test3() {
	System.out.println("Test 3");
}
}


