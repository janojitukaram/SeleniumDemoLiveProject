package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest1POM {
	WebDriver driver;
	
	By txt_username=By.id("input-email");
	By txt_password=By.id("input-password");
	By type_submit = By.xpath("//input[@value='Login']");
	By AccountBreadCrumb=By.linkText("Account");
	
	public LoginTest1POM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void txt_username(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void txt_password(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void type_submit()
	{
		driver.findElement(type_submit).click();;
	}
	public void AccountBreadCrumb()
	{
	System.out.println(driver.findElement(AccountBreadCrumb).isDisplayed());
	}

}
