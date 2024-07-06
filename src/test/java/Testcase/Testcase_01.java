package Testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testcase_01 {
	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement passwordtextbox;
	
	@FindBy(xpath="//*[text()=' Login ']")
	public WebElement clickloginbutton;
	
	public static Testcase_01(driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
