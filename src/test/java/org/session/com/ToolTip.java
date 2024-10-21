package org.session.com;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToolTip {

	@Test
	public void tool() {
WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement element=driver.findElement(By.id("age"));
		String tooltip=element.getAttribute("title");
		String expectedToolTip="We ask for your age only for statistical purposes";
		assertEquals(expectedToolTip, tooltip);
		
	}
}
