package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import dev.failsafe.Timeout;

public class Testbase
{

	// webdriver-done
	// properties-done 
	//logs
	// Extend Reports 
	//db
	//Excel 
	// Mail 

	public static WebDriver driver;
	public static Properties config =  new Properties();
	public static Properties OR =  new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");

	@BeforeSuite
	public void setup() 
	{
		if(driver==null)
		{
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
			System.out.println(System.getProperty("user.dir"));
			try {
				config.load(fis);
				log.debug("config  file Loaded ");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(System.getProperty("user.dir"));
			try {
				OR.load(fis);
				log.debug("OR  file Loaded ");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if(config.getProperty("browser").equals("firefox"))
			{
				//System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resource\\chrome_pwa_launcher");
				driver = new FirefoxDriver();
			}
			else if(config.getProperty("browser").equals("edge"))
			{
				System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resource\\excutables\\msedgedriver");
				driver = new EdgeDriver();
			}
			else if(config.getProperty("browser").equals("chrome"))
			{
				System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resource\\excutables\\chrome_pwa_launcher");
				driver = new EdgeDriver();
			}
			driver.get(config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),TimeUnit.SECONDS);

		}
	}


	@AfterSuite
	public void Teardown()
	{
		if(driver!=null)
		{
			driver.quit();
			log.debug("Test case excution completed ");
		}
	}







}
