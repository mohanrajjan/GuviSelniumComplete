package org.session.com;

import org.testng.annotations.Test;

public class TestNGPrior {

	@Test(priority=2)
	public void A() {
		System.out.println("I am in A");
	}
	@Test(priority=1)
	public void B() {
	System.out.println("I am in B");	
	}
	@Test(priority=0)
	public void C() {
		System.out.println("I am in C");
	}
}
