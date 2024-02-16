package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.Baseclass;

import ProjectObjectManager.PageObjectManager;
import pom.ClickSearch;
import pom.HotelPage;
import pom.LogOut;
import pom.LoginPage;
import pom.SearchHotelPage1;

public class AdactTestng extends Baseclass {

	static PageObjectManager pom;
	@BeforeTest
	public void browser () {
		browserlaunch("chrome");
	}
	
	@BeforeClass
	public void url() {
		launchurl("https://adactinhotelapp.com/");
	}
	@BeforeMethod
	public void login() {
		pom =new PageObjectManager(driver);
		sendValues(pom.getLoginbutton().getUsername(), "Dinesh1993");
		sendValues(pom.getLoginbutton().getPassword(),"811BWB");
		clickOnElement(pom.getLoginbutton().getLogin());
		

	}
	@Test
	public void searchHotel() {
		dropDownvlue(pom.getSearchhotel().getLocation(),"Adelaide");
		dropDownIndex(pom.getSearchhotel().getDesiredhotel(),2);
		dropDownIndex(pom.getSearchhotel().getRoomtype(), 2);
		dropDownIndex(pom.getSearchhotel().getNoofrooms(), 3);
		cleardata(pom.getSearchhotel().getCheckindate());
		sendValues(pom.getSearchhotel().getCheckindate(), "14/02/2024");
		cleardata(pom.getSearchhotel().getCheckoutdate());
		sendValues(pom.getSearchhotel().getCheckoutdate(), "16/02/2024");
		dropDownIndex(pom.getSearchhotel().getAdultrooms(), 3);
		dropDownIndex(pom.getSearchhotel().getChildrooms(),2);
		clickOnElement(pom.getSearchhotel().getClicksearchbutton());
		clickOnElement(pom.getHotelpage().getClickhotelpage());
		clickOnElement(pom.getHotelpage().getContinuebutton());
		sendValues(pom.getHotelpage().getFirstname(), "Giri");
		sendValues(pom.getHotelpage().getLastname(), "Mahi");
		sendValues(pom.getHotelpage().getBillingaddress(), "N0 18, Ponni nagar, Paapanaickenpalayam,Coimbatore");
		sendValues(pom.getHotelpage().getCreditcardnumber(), "123 456 789 123");
		dropDownIndex(pom.getHotelpage().getCreditcardtype(), 2);
		dropDownIndex(pom.getHotelpage().getExpmonth(), 9);
		dropDownIndex(pom.getHotelpage().getExpyear(),12 );
		sendValues(pom.getHotelpage().getCvvnumber(), "123");
		clickOnElement(pom.getHotelpage().getBooknow());
		
		
	}
	@AfterClass
	public void Logout () {
	
		clickOnElement(pom.getLogout().getLogout());		
}
	
	@AfterSuite
	public void closeBrowser() {
		closebrowser();
	}
}