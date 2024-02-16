package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	public WebDriver driver;
	
	@FindBy (xpath="//a[text()='Logout']")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
	public LogOut(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
}
}