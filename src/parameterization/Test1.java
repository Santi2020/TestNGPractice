package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	
	//@Parameters("a")
	@Parameters({"a" , "b"})
	@Test
	public void m1(String s, String t)
	{
		System.out.println("Value of s = " +s);
		System.out.println("Value of t = " +t);
	}
	
	@Parameters("num")
	@Test
	public void m2( String n)
	{
		System.out.println("Inside m2 Value of t = " +n);
	}
}