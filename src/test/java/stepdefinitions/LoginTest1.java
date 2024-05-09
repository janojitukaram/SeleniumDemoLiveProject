package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginTest1POM;

public class LoginTest1 {
	WebDriver driver;
	LoginTest1POM loginpage;

	@Given("web browser should be in the login page")
	public void web_browser_should_be_in_the_login_page() {
		System.out.println("===inside LoginTest1=====");
		System.out.println("browser opened");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("^user enters (.*) and (.*) details on the box$")
	public void user_enters_username_and_details_on_the_box(String username, String password) {
		System.out.println("user enter the details of user anme and password");
		loginpage=new LoginTest1POM(driver);
		loginpage.txt_username(username);
		loginpage.txt_password(password);

//		driver.findElement(By.id("input-email")).sendKeys(username);
//		driver.findElement(By.id("input-password")).sendKeys(password);
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
		System.out.println("user clicked on logged in phase");
		loginpage.type_submit();
		
		
		
		//driver.findElement(By.xpath("//input[@value='Login']")).click();

	}

	@Then("bowser navigated to home page")
	public void bowser_navigated_to_home_page() {
		loginpage.AccountBreadCrumb();
		//System.out.println(driver.findElement(By.linkText("Account")).isDisplayed());

	}

}
