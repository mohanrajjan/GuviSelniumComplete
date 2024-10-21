package org.session.com;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PropertiesRead {

	public static void main(String[] args) throws FileNotFoundException {
		
		Properties prop = new Properties();
		try {
		FileInputStream objinput = new FileInputStream("utils/Credential.propertie");
		prop.load(objinput);}
		 catch(IOException e){
				e.getMessage();
			}
		
		String url=prop.getProperty("url");
		String uname=prop.getProperty("username");
		String passwd=prop.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("user-name")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(passwd);
		driver.findElement(By.id("login-button")).click();
		
		
	}
}
