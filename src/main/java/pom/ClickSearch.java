package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickSearch {
	public WebDriver driver;
	
	@FindBy (xpath="//input[@type='submit']")
	private WebElement clicksearch;
	
	
	public WebElement getClicksearch() {
		return clicksearch;
	}
	
	public ClickSearch(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	
	}
}
