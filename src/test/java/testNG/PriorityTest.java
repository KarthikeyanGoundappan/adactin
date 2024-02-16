package testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PriorityTest {
@Test(groups = {"A","b"})
	public void Eagle () {
	System.out.println("Bird");
	
	}
@Test (enabled = false)
public void Lion () {
	System.out.println("Animal");
	
}
@Test (priority =1)
public void Peacock () {
	System.out.println("National bird");
	
}
@Ignore
public void Tiger () {
	System.out.println("National animal");
}
@Test (groups ="a")
public void Jungle (){
	System.out.println("Forest");
}








}
