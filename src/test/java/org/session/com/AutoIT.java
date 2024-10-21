package org.session.com;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class AutoIT {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		/*
		 * driver.get("https://demo.guru99.com/test/autoit.html");
		 * driver.switchTo().frame("JotFormIFrame-72320244964454"); WebElement ele1 =
		 * driver.findElement(By.id("input_3")); JavascriptExecutor jj =
		 * (JavascriptExecutor) driver; jj.executeScript("window.scrollBy(0,800)");
		 * ele1.sendKeys("Mani");
		 * driver.findElement(By.id("input_4")).sendKeys("Mani@gmail.com");
		 * driver.findElement(By.name("fileupload-input")).click();
		 */
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement ele1 = driver.findElement(By.id("file-upload"));
		Actions bb= new Actions(driver);
		bb.moveToElement(ele1).click().perform();
		Runtime.getRuntime().exec("D:\\Guvi\\uploadAutoitcrt.exe");
		System.out.println("Auto IT Script Run");
		driver.findElement(By.id("file-submit")).click();

	}

}
