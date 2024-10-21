package org.session.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	//@BeforeClass @BeforeMethod

	@AfterTest
	public void after_Test() {
		System.out.println("I Run After Test .XMl");
	}
	@BeforeTest
	public void before_Test() {
	System.out.println("I Run Before Test");	
	}
	@BeforeSuite
	public void before_Suite(){
		System.out.println("I run first suite");
	}
	@AfterSuite
	public void after_Suite() {
		System.out.println("I run after suite");
	}
	@Test
	public void A() {
		System.out.println("Run in Alphabetic A");	
	}
	@Test
	public void B() {
		System.out.println("Run in Alphabetic B");
	}
	@Test
	public void C() {
		System.out.println("Run in Alphabetic order C");
	}
	@BeforeClass
	public void before_Class() {
		System.out.println("I run before class");
	}
	@AfterClass
	public void after_Class() {
		System.out.println("I run after class");
	}
}
