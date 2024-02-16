package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.Baseclass;

import ProjectObjectManager.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.ClickSearch;
import pom.HotelPage;
import pom.LogOut;
import pom.LoginPage;
import pom.SearchHotelPage1;

public class StepDefinition extends Baseclass {
	
	PageObjectManager pom =new PageObjectManager(driver);

	@Given("launch The Adactin Hotal Booking Application Url")
	public void launch_the_adactin_hotal_booking_application_url() {
		launchurl("https://adactinhotelapp.com/");
	}

//	LoginPage log = new LoginPage(driver);

	@When("user Enter The Username In The Username Field")
	public void user_enter_the_username_in_the_username_field() {
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Dinesh1993");
		sendValues(pom.getLoginbutton().getUsername(), "Dinesh1993");
	}

	@When("user Enter The password In The Password Field")
	public void user_enter_the_password_in_the_password_field() {
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("811BWB");
		sendValues(pom.getLoginbutton().getPassword(), "811BWB");

	}

	@Then("user Click The Loginbutton and To Check The Search Hotal Page")
	public void user_click_the_loginbutton_and_to_check_the_search_hotal_page() {
//		driver.findElement(By.xpath("//input[@id='login']")).click();
		clickOnElement(pom.getLoginbutton().getLogin());
	}

	SearchHotelPage1 shp = new SearchHotelPage1(driver);

	@When("user Should Select The Location In The Location Field")
	public void user_should_select_the_location_in_the_location_field() {

		// WebElement location =
		// driver.findElement(By.xpath("//select[@name='location']"));
		// location.click();
		dropDownvlue(pom.getSearchhotel().getLocation(), "Adelaide");
//		Select loc = new Select(location);
//		loc.selectByValue("Adelaide");
	}

	@When("user Should Select The DesiredHotel In THe Hotels Field")
	public void user_should_select_the_desired_hotel_in_t_he_hotels_field() {
//	WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
//		Select hot = new Select(hotel);
//		hot.selectByIndex(2);

		dropDownIndex(pom.getSearchhotel().getDesiredhotel(), 2);
	}

	@When("user Should Select The Roomtype In THe Roomtype Field")
	public void user_should_select_the_roomtype_in_t_he_roomtype_field() {
//		WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
//		Select rm = new Select(room);
//		rm.selectByIndex(4);
		dropDownIndex(pom.getSearchhotel().getRoomtype(), 4);
	}

	@When("user Should Select The Number Of Rooms In THe Number Of Rooms Field")
	public void user_should_select_the_number_of_rooms_in_t_he_number_of_rooms_field() {
//		WebElement rooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
//		Select rms = new Select(rooms);
//		rms.selectByIndex(4);
		dropDownIndex(pom.getSearchhotel().getNoofrooms(), 4);
	}

	@When("user Should Enter The Checkin Date In THe Checkin Date Field")
	public void user_should_enter_the_checkin_date_in_t_he_checkin_date_field() {
//		WebElement checkin = driver.findElement(By.id("datepick_in"));
//		checkin.clear();
//		checkin.sendKeys("04/02/2024");
		cleardata(pom.getSearchhotel().getCheckindate());
		sendValues(pom.getSearchhotel().getCheckindate(), "04/02/2024");
	}

	@When("user Should Enter The Checkout Date In THe CheckOut Date Field")
	public void user_should_enter_the_checkout_date_in_t_he_check_out_date_field() {
//		WebElement checkout = driver.findElement(By.id("datepick_out"));
//		checkout.clear();
//		checkout.sendKeys("05/02/2024");
		sendValues(pom.getSearchhotel().getCheckoutdate(), "05/02/2024");
	}

	@When("user Should Select The Adults In THe Adults Count Per Room Field")
	public void user_should_select_the_adults_in_t_he_adults_count_per_room_field() {
//		WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
//		Select ad = new Select(adult);
//		ad.selectByIndex(1);
		dropDownIndex(pom.getSearchhotel().getAdultrooms(), 1);
	}

	@When("user Should Select The childrens count In THe Childfrens Per Room Field")
	public void user_should_select_the_childrens_count_in_t_he_childfrens_per_room_field() {
//		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
//		Select croom = new Select(child);
//		croom.selectByIndex(1);
		dropDownIndex(pom.getSearchhotel().getChildrooms(), 1);
	}

	@Then("user Should Select The Hotel In THe Hotels Field user Should Click The Search Button")
	public void user_should_select_the_hotel_in_t_he_hotels_field_user_should_click_the_search_button() {
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		clickOnElement(pom.getSearchhotel().getClicksearchbutton());

	}

//
	ClickSearch cs = new ClickSearch(driver);

	@Then("user Should Click The Search button")
	public void user_should_click_the_search_button() {
		// driver.findElement(By.xpath("//input[@type='submit']")).click();
		clickOnElement(pom.getClicksearch().getClicksearch());

	}

	HotelPage hp = new HotelPage(driver);

	@When("user Should Click The Hotel Page")
	public void user_should_click_the_hotel_page() {
		// driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		clickOnElement(pom.getHotelpage().getClickhotelpage());
	}

	@Then("user Should Click The  Continue button")
	public void user_should_click_the_continue_button() {

		// driver.findElement(By.xpath("//input[@id='continue']")).click();
		clickOnElement(pom.getHotelpage().getContinuebutton());
	}

	@When("user Should Insert The First Name")
	public void user_should_insert_the_first_name() {
		// driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Giri");
		sendValues(pom.getHotelpage().getFirstname(), "Giri");
	}

	@When("user Should Insert The Last Name")
	public void user_should_insert_the_last_name() {
		// driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Mahi");
		sendValues(pom.getHotelpage().getLastname(), "Mahi");
	}

	@When("user Should Insert The Billing Address")
	public void user_should_insert_the_billing_address() {
		// driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("D.no18,
		// ponni nagar coimbatore,641001");
		sendValues(pom.getHotelpage().getBillingaddress(), "D.no18, ponni nagar coimbatore,641001");
	}

	@When("user Should Insert The Credit Card Number")
	public void user_should_insert_the_credit_card_number() {
		// driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("1234 5678
		// 9012 3456");
		sendValues(pom.getHotelpage().getCreditcardnumber(), "1234 5678 9012 3456");
	}

	@When("user Should Select The Credit Card Type")
	public void user_should_select_the_credit_card_type() {
//		WebElement card = driver.findElement(By.xpath("//select[@id='cc_type']"));
//		Select cd = new Select(card);
//		cd.selectByIndex(2);
		dropDownIndex(pom.getHotelpage().getCreditcardtype(), 2);
	}

	@When("user Should Select The Expiry Date Month")
	public void user_should_select_the_expiry_date_month() {
//		WebElement exp = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
//		Select expire = new Select(exp);
//		expire.selectByIndex(9);

		dropDownIndex(pom.getHotelpage().getExpmonth(), 9);
	}

	@When("user Should Select The Expiry Date Year")
	public void user_should_select_the_expiry_date_year() {
//		WebElement exyear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
//		Select expyear = new Select(exyear);
//		expyear.selectByIndex(15);
		dropDownIndex(pom.getHotelpage().getExpyear(), 15);
	}

	@When("user Should Insert The CVV Number")
	public void user_should_insert_the_cvv_number() {
		// driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("123");
		sendValues(pom.getHotelpage().getCreditcardnumber(), "123");
	}

	@Then("user Should Click The BookNow button")
	public void user_should_click_the_book_now_button() {
		// driver.findElement(By.xpath("//input[@id='book_now']")).click();
		clickOnElement(pom.getHotelpage().getBooknow());
	}

	LogOut lg = new LogOut(driver);

	@Then("user Should Logout")
	public void user_should_logout() {
		// driver.findElement(By.xpath("//a[text()='Logout']")).click();
		clickOnElement(pom.getLogout().getLogout());
	}

}