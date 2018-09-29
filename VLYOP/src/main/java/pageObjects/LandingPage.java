package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signin = By.xpath("/html/body/div[7]/div/div[1]/div/header/div/nav/ul/li[1]/a");
	By email = By.id("email_or_username");
	By password = By.id("password");
	By loginButton = By.id("login");
	By AttemptNow = By.className("dmpImg");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getSignIn()
	{
		return driver.findElement(signin);
	}
    public WebElement getEmail()
    {	
		return driver.findElement(email);
	}
    public WebElement getPassword()
    {
			return driver.findElement(password);
	}
    public WebElement getLoginButton()
    {
			return driver.findElement(loginButton);
	}
    public WebElement getDMP()
    {
			return driver.findElement(AttemptNow);
	}
}
