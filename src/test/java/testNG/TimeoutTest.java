package testNG;

import org.testng.annotations.Test;

public class TimeoutTest {
	
		@Test (timeOut=1000)
		public void Test1() throws InterruptedException {
			System.out.println("Test1");
			Thread.sleep(500);
		}

		@Test (timeOut=2000)
		public void Test2() {
			System.out.println("Test2");
		}

		@Test
		public void Test3() {
			System.out.println("Test3");
		}
	}

