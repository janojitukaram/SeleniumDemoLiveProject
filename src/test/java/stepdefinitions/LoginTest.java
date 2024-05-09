package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;

	@Given("Browser should be in the google search page")
	public void browser_should_be_in_the_google_search_page() {
		System.out.println("google search website is opened");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@When("user enter any search text on google search")
	public void user_enter_any_search_text_on_google_search() {
		System.out.println("user entered text on google search text box");

		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Step By step Automation");

	}

	@And("hits the search button")
	public void hits_the_search_button() {
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.RETURN);

	}

	@Then("searched results should be opened")
	public void searched_results_should_be_opened() throws InterruptedException {
		System.out.println("search results are found and clicked on online courses");
		driver.findElement(By.linkText("Online Courses")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
