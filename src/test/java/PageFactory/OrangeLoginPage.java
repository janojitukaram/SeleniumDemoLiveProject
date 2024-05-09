package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLoginPage

{
	WebDriver driver;
	@FindBy(name="username")
	WebElement input_username;
	
	@FindBy(name="password")
	WebElement input_password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit_login;
	public OrangeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void eneterUsername(String username)
	{
		input_username.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		input_password.sendKeys(password);
	}
	
	public void clickOnLogin()
	{
		submit_login.click();
	}

}
