package org.session.com;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParaCls {
	@Test
	@Parameters({"a","b"})
	public void add(int c, int d) {
		int sum=c+d;
	System.out.println("Sum of the numbers are : " + sum);	
	}
	
	@Test 
	@Parameters({"a","b"})
	public void sub(int c, int d) {
		int sub=c-d;
	System.out.println("sub of the numbers are : " + sub);	
	}

}
