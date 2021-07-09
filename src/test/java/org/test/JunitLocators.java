package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JunitLocators extends BaseClass{
	public JunitLocators() {
		PageFactory.initElements(driver, this);
	}

	@FindBy (id= "username")
		private WebElement usrnm;
	
	@FindBy (name= "password") 
	private WebElement pswd;
	
	@FindBy (id= "login")
	private WebElement log;
	
	@FindBy (id= "location")
		private WebElement loc;
	@FindBy (id="hotels")
		private WebElement hotel;
	
	@FindBy (id="room_type")
		private WebElement room;
	
	@FindBy (name= "room_nos")
		private WebElement norooms;
	
	@FindBy (name= "Submit")
		private WebElement btnsearch;
	
	@FindBy (name= "radiobutton_0")
		private WebElement btnradio;
	
	@FindBy(name="continue")
		private WebElement btncontin;
	
	@FindBy (name = "first_name")
		private WebElement fname;
	
	@FindBy (name ="last_name")
		private WebElement lname;
	
	@FindBy(name="address")
		private WebElement addrs;
	
	@FindBy (id= "cc_num")
		private WebElement ccno;
	
	@FindBy (id= "cc_type")
		private WebElement cctype;
	
	@FindBy (id="cc_exp_month")
		private WebElement xpmonth;
	
	@FindBy (id= "cc_exp_year")
		private WebElement xpyr;
	
	@FindBy (name= "cc_cvv")
	private WebElement cv;
	
	@FindBy (xpath=("//input[@type = 'button']"))
		private WebElement book;
	
	@FindBy (name ="order_no")
		private WebElement orid;
	
	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getUsrnm() {
		return usrnm;
	}
	public WebElement getLoc() {
		return loc;
	}

	public WebElement getLog() {
		return log;
	}
	
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom() {
		return room;
	}
	
	public WebElement getnoRooms() {
		return norooms;
	}
	public WebElement getbtnSearch() {
		return btnsearch;
		
	}
	public WebElement getbtnRadio() {
		return btnradio;
	}
	public WebElement getbtnContin() {
		return btncontin;
	}
	public WebElement getfName() {
		return fname;
	}

	public WebElement getNorooms() {
		return norooms;
	}

	public WebElement getBtnsearch() {
		return btnsearch;
	}

	public WebElement getBtnradio() {
		return btnradio;
	}

	public WebElement getBtncontin() {
		return btncontin;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddrs() {
		return addrs;
	}

	public WebElement getCcno() {
		return ccno;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getXpmonth() {
		return xpmonth;
	}

	public WebElement getXpyr() {
		return xpyr;
	}

	public WebElement getCv() {
		return cv;
	}

	public WebElement getBook() {
		return book;
	}
	public WebElement getorId() {
		return orid;
	}
	
}


