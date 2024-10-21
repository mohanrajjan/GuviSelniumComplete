package org.session.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGT {
	//for exclude method <methods><exclude name="a"/></method>
	//for excluding class <methods><exclude name=".*"/></method>
	//enabled="false" we can exclude methods in a class
	//for 2 methods use include tag 2 times in xml file groups/methods
	WebDriver driver;
    @Test(groups= {"Stest","Regression"})
	public void A() {
	
		/*
		 * driver = new ChromeDriver(); driver.get("https://www.google.co.in");
		 * 
		 */
    	System.out.println("Method A");
	}
    @Test(groups="Stest")
    public void B() {
    	System.out.println("Method B");
    }
    @Test(groups="Regression")
    public void C() {
    	System.out.println("Method C");
    }
    @Test
    public void D() {
    	System.out.println("Method D");
    }
    @Test
    public void G() {
    	System.out.println("Method G");
    }
}
