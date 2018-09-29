package TestCases;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import MyFirstFramework.Base;
import pageObjects.AllCoursesPostLogin;
import pageObjects.LandingPage;
import pageObjects.MyCourses;
import pageObjects.SignUp;

public class SignUpWithMandatoryField extends Base {

	@Test
	public void basePageNavigation() throws IOException
	
	{
		driver=initializeDriver();
		driver.get("http://www.vlyop.com/");
		//Maximize window
		driver.manage().window().maximize();
		
		//Using object object of landing page
		//2 methods to access methods of other class either extends(inheritance) or create object of that class
		
		SignUp s= new SignUp(driver);
		s.getSignup().click();
		s.getname().sendKeys("Sudersh Sharma");
		s.getemail().sendKeys("sudersh.sharma1@100percentile.com");
		s.getGenderMale().click();
		s.username().sendKeys("sudersh");
		s.password().sendKeys("ggn@1234");
		//s.password().sendKeys(Keys.TAB);
		//s.password().sendKeys(Keys.ENTER);
		//s.confirmationPassword().click();
		System.out.println(s.PasswordConfirmation().isDisplayed());
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password_confirmation")));
		
		driver.findElement(By.name("password_confirmation")).sendKeys("ggn@1234");
		//s.PasswordConfirmation().sendKeys("ggn@1234");
		s.phoneNumber().sendKeys("7503886830");
		//s.submitButton().click();
		System.out.println("Successfully created user");
		// Taking ScreenShot
				TakesScreenshot scrShot =((TakesScreenshot)driver);
				File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(SrcFile, new File("D:\\VLYOP\\SignUp.png"));
		
	}
	
		
	}

