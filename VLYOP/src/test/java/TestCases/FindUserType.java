package TestCases;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import MyFirstFramework.Base;
import pageObjects.AllCoursesPostLogin;
import pageObjects.LandingPage;
import pageObjects.MyCourses;

public class FindUserType extends Base {

	@Test
	public void basePageNavigation() throws IOException
	
	{
		driver=initializeDriver();
		driver.get("http://www.vlyop.com/");
		//Maximize window
		driver.manage().window().maximize();
		// Taking ScreenShot
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile, new File("D:\\VLYOP\\VlyopHomePage.png"));
		
		//Using object object of landing page
		//2 methods to access methods of other class either extends(inheritance) or create object of that class
		try{
		LandingPage l= new LandingPage(driver);
		l.getSignIn().click();
		l.getEmail().sendKeys("manmohan");
		l.getPassword().sendKeys("ggn@1234");
		l.getLoginButton().click();
		//driver.switchTo().alert().dismiss();
		AllCoursesPostLogin pl= new AllCoursesPostLogin(driver);
		Thread.sleep(1000);
		pl.getMyCourses().click();
		MyCourses mc = new MyCourses(driver);
		mc.getTeaching().click();
		if(mc.getTeaching().isDisplayed())
		{
			System.out.println("User is teacher");
		}
		else
		{
			System.out.println("User is Student");
		}
		}
		catch (Exception e) {
			
			System.out.println("ERROR");
		}
	}
	
		
	}

