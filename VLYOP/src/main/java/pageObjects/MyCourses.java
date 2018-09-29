package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyCourses {
	
	public WebDriver driver;
	
	By Learning = By.xpath("/html/body/div[7]/div/div[1]/div/div/div/div/div/ul/li[1]/a");
	By Teaching = By.xpath("/html/body/div[7]/div/div[1]/div/div/div/div/div/ul/li[2]/a");
	
	
	
	public MyCourses(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getLearning()
	{
		return driver.findElement(Learning);
	}
    public WebElement getTeaching()
    {	
		return driver.findElement(Teaching);
	}
}
