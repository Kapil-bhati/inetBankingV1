package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="uid")
	WebElement txtUsername;
	
	@FindBy(name="password")
	WebElement txtpwd;
	
	@FindBy(name="btnLogin")
	WebElement clickButton;
	
	public void setUserName(String uName)
	{
		txtUsername.sendKeys(uName);
	}

	public void password(String pwd)
	{
		txtpwd.sendKeys(pwd);
	}

	public void clickBtn()
	{
		clickButton.click();
	}
	

}








