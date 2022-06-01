package com.Amazon.POMClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ALoginPagePomClass

{
public WebDriver driver;
	



	@FindBy(xpath="//span[contains(@id,'nav-link-accountList-nav-line-1')]")
	private WebElement signinclick;
	public void signinclick()
	{
		signinclick.click();
	}
	@FindBy(xpath="//input[contains(@id,'ap_email')]")
	private WebElement username;
	public void sendusername()
	{
		username.sendKeys("7769981251");
	}
	
	@FindBy(xpath="//input[contains(@id,'continue')]")
	private WebElement usernamecontinuebutton;
	public void clickusernamecontinue()
	{
		usernamecontinuebutton.click();
	}
	
	@FindBy(xpath="//input[contains(@type,'password')]")
	private WebElement password;
	public void sendpassword()
	{
		password.sendKeys("Girish@selenium");
	}
	
	@FindBy(xpath="//input[contains(@id,'signInSubmit')]")
	private WebElement signinbutton2;
	public void clicksigninbutton2()
	{
		signinbutton2.click();
	}
	
	
	
	public ALoginPagePomClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
