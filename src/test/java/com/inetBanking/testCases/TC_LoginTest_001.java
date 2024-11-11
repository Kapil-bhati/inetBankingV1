package com.inetBanking.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	// WebDriver driver;
	
	@Test
	public void loginTC() 
	{
	 LoginPage login=new LoginPage(driver);
     login.setUserName(username);
     login.password(password);
     login.clickBtn();
     String actualText = driver.findElement(By.xpath("//h2[text()='Gtpl Bank']")).getText();
     Assert.assertEquals(actualText,"Gtpl Bank");     
     
	}

}
