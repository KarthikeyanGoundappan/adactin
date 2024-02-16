package ProjectObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pom.ClickSearch;
import pom.HotelPage;
import pom.LogOut;
import pom.LoginPage;
import pom.SearchHotelPage1;

public class PageObjectManager {

	public WebDriver driver;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, driver);
	}

	private LoginPage loginbutton;



	public LoginPage getLoginbutton() {
		loginbutton	 = new LoginPage(driver);
		return loginbutton;
	}

	public HotelPage getHotelpage() {
		hotelpage = new HotelPage(driver);
		return hotelpage;
	}

	public SearchHotelPage1 getSearchhotel() {
		Searchhotel = new SearchHotelPage1(driver);
		return Searchhotel;
	}

	public ClickSearch getClicksearch() {
		Clicksearch  = new ClickSearch(driver);
		return Clicksearch;
	}

	public LogOut getLogout() {
		Logout = new LogOut(driver);
		return Logout ;
	}

	private HotelPage hotelpage;
	private SearchHotelPage1 Searchhotel;
	private ClickSearch Clicksearch;
	private LogOut Logout;
}
