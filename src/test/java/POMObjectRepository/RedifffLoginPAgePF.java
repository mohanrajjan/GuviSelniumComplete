package POMObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//page factory is the optimize version of POM(Faster)
//optimization is acheived by some annotations
//@FindBy
//@FindBys, @FindAll, @CacheLoopUp

//In PF, All objects are initialized with initElements()
public class RedifffLoginPAgePF {

	WebDriver driver;
	public RedifffLoginPAgePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//objects on redifflogin page that we r  going to interact
	
	@FindBy(id="login1") WebElement username;
	@FindBy(id="password")WebElement password;
	@FindBy(linkText="rediff.com") WebElement link;
	@FindBy(xpath="//input[@type='submit']") WebElement SignButton;
	
	public void enterData(String uname, String psw) {
		username.sendKeys(uname);
		password.sendKeys(psw);
	}
	public void clickLink() {
		link.click();
	}
}
