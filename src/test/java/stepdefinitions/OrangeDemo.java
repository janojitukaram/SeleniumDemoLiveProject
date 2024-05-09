package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.OrangeLoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeDemo {
	WebDriver driver;
	OrangeLoginPage login;
	
	@Given("user should able to open the Orange website")
	public void user_should_able_to_open_the_orange_website() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("^user enter (.*) and (.*) details$")
	public void user_enter_username_and_password_details(String username,String password) {
		
		login = new OrangeLoginPage(driver);
		login.eneterUsername(username);
		login.enterPassword(password);

	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		login.clickOnLogin();
	    
	}

	@Then("user navigated to home screen")
	public void user_navigated_to_home_screen() {
	 
	}

}
