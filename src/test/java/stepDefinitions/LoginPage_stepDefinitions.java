package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObjects;

public class LoginPage_stepDefinitions {
	
	WebDriver driver;
	LoginPageObjects lp;
	
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		driver = new ChromeDriver();
		lp = new LoginPageObjects(driver);
	   
	}

	@When("Browse URL {string}")
	public void browse_url(String URL) {
		driver.get(URL);
	   
	}

	@When("Enter Email as {string}")
	public void enter_email_as(String email) {
		lp.enterEmail(email);
	    
	}

	@When("Enter Password as {string}")
	public void enter_password_as(String pwd) throws InterruptedException {
		lp.enterPwd(pwd);
		Thread.sleep(3000);
	}

	@When("Click Login")
	public void click_login() throws InterruptedException {
		lp.click();
		Thread.sleep(3000);
	}

	@Then("User logs in successfully")
	public void user_logs_in_successfully() {
		System.out.println("login successfull");
	   
	}

}
