package com.inetBanking.testCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public String baseURL="https://demo.guru99.com/V1/index.php";
	public String username="mngr564093";
	public String password="tepyguj";
	public static WebDriver driver;
	
	
	   @BeforeClass
	   void setupClass()
	   {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
       Logger log=LogManager.getLogger("e-banking");
       System.out.println("This is logger demo");
       log.info("For info only");
       log.fatal("fatal msg");     
        
       
	   }
	   
	   @AfterClass
	   void tearDown()
	   {
		   driver.close();
	   }

}
