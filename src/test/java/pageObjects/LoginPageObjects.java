package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	
	WebDriver driver;
	
	public LoginPageObjects(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="Email") WebElement email;
	@FindBy (id="Password") WebElement pwd;
	@FindBy (xpath="//button[@type='submit']") WebElement loginBtn;
	
	public void enterEmail(String eml) {
		email.clear();
		email.sendKeys(eml);
	}
	
	public void enterPwd(String p) {
		pwd.clear();
		pwd.sendKeys(p);
	}
	
	public void click() throws InterruptedException {
		loginBtn.click();
		Thread.sleep(3000);
	}

}
