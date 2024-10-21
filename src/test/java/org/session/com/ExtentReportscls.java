package org.session.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportscls {
	//Classes :  ExtentSparkReporter class - Customize the report, sets the path , 
		//ExtentReports ( Generates HTML reports)
		ExtentSparkReporter reporter;
		ExtentReports extent;
		ExtentTest test;
		
		@BeforeTest
		public void config() {
			String path=System.getProperty("user.dir")+"\\reports\\index.html";
			reporter=new ExtentSparkReporter(path);
			reporter.config().setReportName("SauceDemo Test Results");
			reporter.config().setDocumentTitle("Login Test Results");
			
			extent=new ExtentReports();
			extent.attachReporter(reporter); // Association between ExtentSparkReporter n ExtentReports
		    extent.setSystemInfo("Tester", "Mrudul");
		}
		
		
		@Test
		public void FirstTest() {
			test=extent.createTest("FirstTest");  // creating test section inside report
			WebDriver driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("user-name")).sendKeys("standard_user");		
			driver.findElement(By.id("password")).sendKeys("secret_sauce");	
			driver.findElement(By.id("login-button")).click();
			String ExpectedT="Swag Labs";
			String ActualT=driver.getTitle();
			Assert.assertEquals(ExpectedT, ActualT);	
		}
		
		@Test
		public void SecondTest() {
			test=extent.createTest("SecondTest");  // creating test section inside report
			SoftAssert sa = new SoftAssert();
			WebDriver driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("user-name")).sendKeys("locked_out_user");		
			driver.findElement(By.id("password")).sendKeys("secret_sauce");	
			driver.findElement(By.id("login-button")).click();
			String ExpectedT="Swag Labss";
			String ActualT=driver.getTitle();
			Assert.assertEquals(ExpectedT, ActualT);
			sa.assertAll();
		}
		@AfterTest
		public void afterTest() {
			extent.flush();	
		}
		@AfterMethod()
		public void getResult(ITestResult result) {
			if(result.getStatus()==ITestResult.FAILURE)
				test.log(Status.FAIL,result.getThrowable());
			
		}

}
