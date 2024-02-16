package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver driver;
	
	public static void browserlaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\GIRIMAHI\\eclipse-workspace\\Maven_Intro\\Driver12\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\GIRIMAHI\\eclipse-workspace\\Maven_Intro\\Driver12\\chromedriver.exe");
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\GIRIMAHI\\eclipse-workspace\\Maven_Intro\\Driver12\\chromedriver.exe");
		}
	}

	public static void closebrowser() {
		driver.close();
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void cleardata(WebElement element) {
		element.clear();
	}

	public static void quitbrowser() {
		driver.quit();
	}

	public static void draganddrop(WebElement source, WebElement destination) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).build().perform();
		
	}

	public static void launchurl(String url) {

		driver.get(url);

	}

	public static void robotclass(String method) throws AWTException {
		Robot r = new Robot();
		if (method.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
		} else if (method.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
		}

	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void title() {
		driver.getTitle();
	}

	public static void sendValues(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void navigateMethods(String method, String url) {
		if (method.equalsIgnoreCase("back")) {
			driver.navigate().back();
		} else if (method.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		} else if (method.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		} else if (method.equalsIgnoreCase("to")) {
			driver.navigate().to(url);

		}
	}

	public static void printScreen(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\HP\\eclipse-workspace\\JAVA\\Data_Driven\\screenshot\\" + filename + ".png");
		FileUtils.copyDirectory(source, destination);
	}

	public static void dropDowntxt(WebElement element, String value) {

		Select elements = new Select(element);
		elements.selectByVisibleText(value);
	}

	public static void Options(WebElement element) {
		Select elements = new Select(element);
		elements.getOptions();
	}

	public static void dropDownvlue(WebElement element, String value) {
		Select elements = new Select(element);
		elements.selectByValue(value);

	}

	public static void dropDownIndex(WebElement element, int index) {
		Select elements = new Select(element);
		elements.selectByIndex(index);

	}

	public static void getfirstselectedoption(WebElement element) {
		Select elements = new Select(element);
		elements.getFirstSelectedOption();

	}

	public static void radiobutton(WebElement element) {
		element.click();

	}

	public static void gettext(WebElement element) {
		element.getText();
	}

	public static void geturl() {
		driver.getCurrentUrl();
	}

	public static void checkbox(WebElement element) {
		element.click();

	}

	public static void rightClick(WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).build().perform();
	}

	public static void doubleClick(WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).build().perform();
	}

	public static void windowHandles(String tab, Set<String> tabs) {
		tab = driver.getWindowHandle();
		System.out.println(tab);
		tabs = driver.getWindowHandles();
		for (String str : tabs) {
			driver.switchTo().window(str);

		}

	}

	public static void singleframe(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void multiFrame(WebElement ele, WebElement element) {

		driver.switchTo().frame(ele);
		driver.switchTo().frame(element);
		driver.switchTo().defaultContent();
	}

	public static void alert(String type, WebElement element, String value) {
		if (type.equalsIgnoreCase("simple")) {
			element.click();
		} else if (type.equalsIgnoreCase("confirm")) {
			driver.switchTo().alert().accept();

		} else if (type.equalsIgnoreCase("prompt")) {
			driver.switchTo().alert().sendKeys(value);
		}

	}

	public static void waits() throws InterruptedException {
		Thread.sleep(2500);
	}

	public static void selection(WebElement elment, String type) {
		Select elements = new Select(elment);
		if (type.equalsIgnoreCase("enabled")) {
			elment.isEnabled();
		} else if (type.equalsIgnoreCase("displayed")) {
			elment.isDisplayed();
		} else if (type.equalsIgnoreCase("selected")) {
			elment.isSelected();
		} else if (type.equalsIgnoreCase("multiple")) {
			elements.isMultiple();
		}
	}

	public static void scrollMethod(String type, WebElement element) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (type.equalsIgnoreCase("Scrolldown")) {
			js.executeScript("window." + type + "(0,1500)");
			
		}
		else if(type.equalsIgnoreCase("Scrollup")) {
			js.executeScript("winodw." + type + "(0,-1000");
			}
		 else {
			js.executeScript("arguments[0].scrollIntoView();", element);
		}
	}}