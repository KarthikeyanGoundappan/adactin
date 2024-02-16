package testNG;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test (invocationCount = 10)
	public void Method1 () {
		System.out.println("Giri");
	}
	@Test
	public void Method2() {
		System.out.println("Mahi");
	}
	@Test
	public void Method3 () {
		System.out.println("GiriMahi");
	}
}
