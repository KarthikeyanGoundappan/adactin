package testNG;

import org.testng.annotations.Test;

public class ArithmaticException {
@Test(expectedExceptions = ArithmeticException.class)
public void Addition() {
	int a = 10/0;
	System.out.println("add");
}
@Test
public void Subtraction () {
	System.out.println("Sub");
}
@Test
public void Multiply () {
	System.out.println("multiple");
}
	
}