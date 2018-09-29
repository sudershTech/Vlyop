package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp {
	
	public WebDriver driver;
	
	By signup = By.xpath("/html/body/div[7]/div/div[1]/div/header/div/nav/ul/li[2]/a");
	By name = By.id("name");
	By email = By.id("signUpEmail");
	By radioButtonMale = By.name("sex");
	By radioButtonFemale = By.xpath("/html/body/div[4]/div/div/div/div[2]/form/div[3]/div/label[2]");
	By username = By.id("username");
	By password = By.id("signUpPassword");
	By confirmationPassword = By.name("password_confirmation");
	By phoneNumber = By.id("phone_number");
	By submitButton= By.id("signup");
	public SignUp(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getSignup()
	{
		return driver.findElement(signup);
	}
    public WebElement getname()
    {	
		return driver.findElement(name);
	}
    public WebElement getemail()
    {
			return driver.findElement(email);
	}
    public WebElement getGenderMale()
    {
			return driver.findElement(radioButtonMale);
	}
    public WebElement getGenderFemale()
    {
			return driver.findElement(radioButtonFemale);
	}
    public WebElement username()
    {
			return driver.findElement(username);
	}
    public WebElement password()
    {
			return driver.findElement(password);
	}
  
    public WebElement PasswordConfirmation()
    {
    	//WebDriverWait wait = new WebDriverWait(driver, 40);
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationPassword));
		return driver.findElement(confirmationPassword);
	}

    public WebElement phoneNumber()
    {
			return driver.findElement(phoneNumber);
	}
    public WebElement submitButton()
    {
			return driver.findElement(submitButton);
	}
}

