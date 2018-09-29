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
import pageObjects.DMP;
import pageObjects.LandingPage;
import pageObjects.MyCourses;
import pageObjects.SignUp;

public class DmpVerify extends Base {

	@Test
	public void basePageNavigation() throws IOException
	
	{
		driver=initializeDriver();
		driver.get("http://www.vlyop.com/");
		//Maximize window
		driver.manage().window().maximize();
		
		//Using object object of landing page
		//2 methods to access methods of other class either extends(inheritance) or create object of that class
		
		// Taking ScreenShot
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile, new File("D:\\VLYOP\\TodayDMP.png"));
        LandingPage l= new LandingPage(driver);
		DMP d= new DMP(driver);
		l.getDMP().click();
		System.out.println(d.DmpDate().getText());
		//System.out.println(d.DmpPoints());
		
	}
	
		
	}

