package pack1;

import org.testng.annotations.*;
;

public class TC1 {

	@Test
	void m1()
	{
		System.out.println("Inside m1");
	}
	
	@Test
	void m2()
	{
		System.out.println("Inside m2");
	}
	
	@AfterTest
	void nn()
	{
		System.out.println("Inside AfterTest");
	}
}
