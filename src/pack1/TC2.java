package pack1;

import org.testng.annotations.*;

public class TC2 {
	@Test
	void m5()
	{
		System.out.println("Inside m5");
	}
	
	@Test
	void m3()
	{
		System.out.println("Inside m3");
	}
	
	@Test
	void m4()
	{
		System.out.println("Inside m4");
	}
	
	
	@BeforeTest
	void mm()
	{
		System.out.println("Inside Before Test mm");
	}
	
}
