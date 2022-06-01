package com.Amazon.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass
{

public WebDriver driver;
private Action act;

	

	@FindBy(xpath="//input[contains(@id,'twotabsearchtextbox')]")
	private WebElement search;
	public void search()
	{
		search.sendKeys("logitech mouse");
    }
	
	@FindBy(xpath="//input[contains(@id,'nav-search-submit-button')]")
	private WebElement clicksearchbutton;
	public void searchclick()
	{
		search.click();
    }
	
	@FindBy(xpath=("//span[contains(@class,'a-size-medium a-color-base a-text-normal')])[1]"))
	private WebElement clickonproduct;
	public void mouseproduct()
	{
		clickonproduct.click();
    }
	
	private Select s;
	@FindBy(xpath="//select[contains(@id,'searchDropdownBox')]")
     private WebElement dropdown;
	public void selectalldropdownlist()
	{
	dropdown.click();
	s.selectByVisibleText("Alexa Skills");
	}
	
	
	
	
	
	
	
	public HomePagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		 s = new Select(dropdown);
	}
	
}














//{
//int count=dropdown.size();
//for(int i=0;i<count;i++)
//{
// if(alldropdownlist.get(i).getText().contains("Appliances"))
//
// alldropdownlist.get(i).click();
// break;


//@FindBy(xpath="//select[contains(@id,'searchDropdownBox')]")
//private List<WebElement> alldropdownlist;
//
//public void selectalldropdownlist()
//{
//int count=alldropdownlist.size();
//for(int i=0;i<count;i++)
//{
// if(alldropdownlist.get(i).getText().contains("Appliances"))
//
// alldropdownlist.get(i).click();
// break;

