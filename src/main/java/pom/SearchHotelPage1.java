package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage1 {
	public WebDriver driver;
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement desiredhotel;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomtype;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement noofrooms;

	@FindBy(id = "datepick_in")
	private WebElement checkindate;

	@FindBy(id = "datepick_out")
	private WebElement checkoutdate;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultrooms;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement childrooms;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement clicksearchbutton;



	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getDesiredhotel() {
		return desiredhotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultrooms() {
		return adultrooms;
	}

	public WebElement getChildrooms() {
		return childrooms;
	}

	public WebElement getClicksearchbutton() {
		return clicksearchbutton;
	}
	public SearchHotelPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

		
}
