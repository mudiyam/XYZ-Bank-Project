package Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Testbase;


public class LoginTest extends Testbase
{
	@Test
	public void loginAsBankManager() throws InterruptedException
	{
		driver.findElement(By.cssSelector(OR.getProperty("bmlgnbtn"))).click();
		Thread.sleep(2000);
		
	}
	

}
