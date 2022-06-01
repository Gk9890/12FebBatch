package com.Amazon.TESTClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Amazon.POMClasses.ALoginPagePomClass;

public class TC_01LoginFunctionality 
{
	
	
//public static void main(String[] args) 
{
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\avelocity_software\\Dri\\chromedriver_win32\\chromedriver.exe");
	
	   WebDriver driver= new ChromeDriver();
	   //Opening web application
 driver.get("https://www.amazon.in/");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 
 ALoginPagePomClass lp=new ALoginPagePomClass(driver );
 
 lp.signinclick();
 System.out.println("click on signin button");
 lp.sendusername();
 System.out.println("username entered");
 lp.clickusernamecontinue();
 System.out.println("click on continue button");
 lp.sendpassword();
 System.out.println("password entered");
 lp.clicksigninbutton2();
 System.out.println("click on sign in button");
 
   String ActualURL=driver.getTitle();
   System.out.println(ActualURL);
   String ExpectedURL = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
 if(ActualURL.equals(ExpectedURL))
 {
	 System.out.println("test case is passed");
 }
 else
 {
	 System.out.println("Test case is failed");
 }
 
 
}
}
