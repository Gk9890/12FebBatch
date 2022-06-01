package com.Amazon.TESTClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.Amazon.POMClasses.ALoginPagePomClass;
import com.Amazon.POMClasses.HomePagePOMClass;

public class TC_02HomeFunctionality
{

 @Test
// public static void Screenshot(WebDriver driver) throws IOException 
// {
// 	
// 	Date d = new Date();
// 	DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
// 	String date = d1.format(d); 
//    
//
// 	
// 	TakesScreenshot ts= (TakesScreenshot)driver;
// 	File source  =  ts.getScreenshotAs(OutputType.FILE) ;                     
// 	File destfile = new File("D:\\A_VELOCITY\\Automation\\Selenium\\Amazonpage"+date+".jpg");
// 	FileHandler.copy(source, destfile);
// 	System.out.println("Screeshot is taken");
// }


 public void HomeFunctionality() throws IOException

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

HomePagePOMClass hp= new HomePagePOMClass(driver);
hp.selectalldropdownlist();














//hp.search();
//
//hp.searchclick();
//hp.selectalldropdownlist();
//hp.mouseproduct();
//System.out.println("product is selected");
////Screenshot(driver);
//System.out.println("Screenshot is taken");	 


}
}