package com.abc.magentoobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome 
{
	WebDriver driver;
	By lintext=By.linkText("My Account");
	public Welcome(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickon()
	{

		driver.findElement(lintext).click();
	}
	
		
}
