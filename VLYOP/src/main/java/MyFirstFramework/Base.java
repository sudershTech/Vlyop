package MyFirstFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public WebDriver driver; 
	public WebDriver initializeDriver() throws IOException{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Maven\\VLYOP\\src\\main\\java\\basedata.properties");
		prop.load(fis);
		String BrowserName= prop.getProperty("browser");
		if (BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D://Sud/Study Material/Selenium_Udemy/chromedriver_win32/chromedriver.exe");
			 driver= new ChromeDriver();
			
		}
		else if(BrowserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D://Sud//Study Material//Selenium_Udemy//geckodriver-v0.18.0-win64//geckodriver.exe");
			 driver= new FirefoxDriver();
			
		}
		else
		{
			 driver= new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS );
		
		return driver;
	}

}
