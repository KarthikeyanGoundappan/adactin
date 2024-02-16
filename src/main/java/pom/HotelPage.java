package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPage {

	public WebDriver driver;

	@FindBy (xpath="//input[@id='radiobutton_0']")
	private WebElement clickhotelpage;
	
	@FindBy (xpath="//input[@id='continue']")
private WebElement continuebutton;
	
	@FindBy (xpath="//input[@id='first_name']")
	private WebElement firstname;
	

	@FindBy (xpath="//input[@id='last_name']")
	private WebElement lastname;
	

	@FindBy (xpath="//textarea[@name='address']")
	private WebElement billingaddress;
	
	@FindBy (xpath="//input[@id='cc_num']")
	private WebElement creditcardnumber;
	
	@FindBy (xpath="//select[@id='cc_type']")
	private WebElement creditcardtype;
	
	@FindBy (xpath="//select[@name='cc_exp_month']")
	private WebElement expmonth;
	
	@FindBy (xpath="//select[@id='cc_exp_year']")
private WebElement expyear;
	
	@FindBy (xpath="//input[@id='cc_cvv']")
			private WebElement cvvnumber;
	
	@FindBy (xpath="//input[@id='book_now']")
	private WebElement booknow;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getClickhotelpage() {
		return clickhotelpage;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	public WebElement getCreditcardnumber() {
		return creditcardnumber;
	}

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public HotelPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	
}
}


