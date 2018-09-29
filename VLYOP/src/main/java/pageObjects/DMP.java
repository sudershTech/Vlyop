package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DMP {
	
	public WebDriver driver;
	
	By dmpDate = By.className("maxPoints");
	By dmpPoints = By.xpath("/html/body/div[5]/div/div[3]/div/div/div/div/span[2]");
	
	public DMP(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement DmpDate()
	{
		return driver.findElement(dmpDate);
	}
    public WebElement DmpPoints()
    {	
		return driver.findElement(dmpPoints);
	}
    
   
}

