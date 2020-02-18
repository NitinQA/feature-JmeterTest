package testpackage;

import org.testng.annotations.Test;

public class InvocationCount {

	
	@Test(invocationCount=10)
	public void multipleTime()
	{
		int a, b, c;
		a=10;
		b=20;
		c=a+b;
		System.out.println("The sum of c = "+c);
	}
}
