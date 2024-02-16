package testNG;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority_Test1 {
	
@Test (dependsOnMethods = "Gmail")
	public void addition () {
		System.out.println("add");
	}
@Test
	public void Subtraction () {
		System.out.println("Sub");
	}
@Test
	public void FbLogin() {
		System.out.println("Giri");
	}
@Test 
	public void InstaLogin() {
		System.out.println("GiriMahi1998");
	}
@Test
	public void Gmail() {
	Assert.fail();
		System.out.println("Karthikeyang1202@gmail.com");
	}
}
