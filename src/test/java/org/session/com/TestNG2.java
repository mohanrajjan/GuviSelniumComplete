package org.session.com;

import org.testng.annotations.Test;

public class TestNG2 {

	@Test(groups="UAT")
	public void E() {
		System.out.println("Method E");
	}
	@Test(groups="Regression")
	public void F() {
		System.out.println("Method F");
	}
}
