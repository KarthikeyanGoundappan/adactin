package com.adactin;

import javax.swing.Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Project {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty
		("webdriver.chrome.driver", "C:\\Users\\GIRIMAHI\\eclipse-workspace\\Maven_Intro\\Driver12\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
	search.sendKeys("adactin hotel");
	//Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class=\"pcTkSc\"]//div[@id=\"jZ2SBf\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//h3[text()='Adactin.com - Hotel Reservation System']")).click();
	WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
	//Username
	user.sendKeys("Sathish1826");
	//Thread.sleep(1000);
	user.click();
	WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
	//Password
	pass.sendKeys("Sathish3456");
	//Thread.sleep(1000);
	pass.click();
	//Login
	driver.findElement(By.xpath("//input[@id='login']")).click();
	//location
	WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
	location.click();
	Select loc = new Select(location);
	loc.selectByIndex(4);
	WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
	Select hot = new Select(hotel);
	hot.selectByIndex(2);
	WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
	Select rm = new Select(room);
rm.selectByIndex(4);
WebElement rooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
Select rms = new Select (rooms);
rms.selectByIndex(4);
WebElement checkin = driver.findElement(By.xpath("//input[@value='03/01/2024']"));
checkin.clear();
checkin.sendKeys("04/01/2024");
WebElement checkout = driver.findElement(By.xpath("//input[@value='04/01/2024']"));
checkout.clear();
checkout.sendKeys("05/01/2024");
WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
Select ad = new Select (adult);
ad.selectByIndex(4);
WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
Select croom = new Select (child);
croom.selectByIndex(2);
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
driver.findElement(By.xpath("//input[@id='continue']")).click();
driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Giri");
driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Mahi");
driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("D.no18, ponni nagar coimbatore,641001");
driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("1234 5678 9012 3456");
WebElement card = driver.findElement(By.xpath("//select[@id='cc_type']"));
Select cd = new Select(card);
cd.selectByIndex(2);
WebElement exp = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
Select expire = new Select(exp);
expire.selectByIndex(9);
//Thread.sleep(1000);
WebElement exyear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
Select expyear = new Select (exyear);
expyear.selectByIndex(15);
//Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("123");
driver.findElement(By.xpath("//input[@id='book_now']")).click();
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("window.scrollBy(0,1000)");
//Thread.sleep(5000);
driver.findElement(By.xpath("//input[@value=\"Logout\"]")).click();

	//	Robot rb = new Robot();
//	Thread.sleep(1000);
//	rb.keyPress(KeyEvent.VK_DOWN);
//	rb.keyPress(KeyEvent.VK_DOWN);
//	rb.keyPress(KeyEvent.VK_DOWN);
	
	
//	rb.keyPress(KeyEvent.VK_DOWN);
//	rb.keyPress(KeyEvent.VK_DOWN);
//	rb.keyPress(KeyEvent.VK_DOWN);
//	rb.keyPress(KeyEvent.VK_ENTER);
	}
}	