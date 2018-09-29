package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllCoursesPostLogin {
	
	public WebDriver driver;
	
	By MyCourses = By.xpath("//a[contains(@href,'#myCourses')]");
	By AllCourses = By.xpath("/html/body/div[7]/div/div[1]/div/header/div/nav/ul/li[2]/a");
	By AttemptNow = By.id("/html/body/div[7]/div/div[2]/div/div/a/img");
	
	
	public AllCoursesPostLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement getMyCourses()
	{
		return driver.findElement(MyCourses);
	}
    public WebElement getAllCourses()
    {	
		return driver.findElement(AllCourses);
	}
    public WebElement getAttemptNow()
    {
			return driver.findElement(AttemptNow);
	}
}
