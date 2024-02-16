package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

class TestNg {
	@BeforeSuite
	public void Setup() {
		System.out.println("Setproperty");
	}

	@BeforeTest
	public void browserlaunch() {
		System.out.println("Chrome");
	}

	@BeforeClass
	public void launchurl() {
		System.out.println("Myntra");
	}

	@BeforeMethod
	public void login() {
		System.out.println("giri");
	}

	@Test
	public void searchTshirt() {
		System.out.println("Roadster");
	}

	@Test
	public void SearchJeans() {
		System.out.println("Wrogn");
	}

	@AfterMethod
	public void validate() {
		System.out.println("validation");
	}

	@AfterClass
	public void logout() {
		System.out.println("logoff");
	}

	@AfterTest
	public void deletecookies() {
		System.out.println("deletecookies");
	}

	@AfterSuite
	public void closeBrowser() {
		System.out.println("Browser closed");
	}
}