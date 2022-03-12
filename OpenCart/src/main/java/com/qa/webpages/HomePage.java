package com.qa.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(ldriver,this);
	}
	/*
	 @FindBy(xpath="")
	     WebElement   ;
	     public WebElement  (){
	     return  ;
	     }
	 * */
	
	@FindBy(xpath="//span[text()='My Account']")
	 WebElement Myaccount;
	
	
	  public WebElement  get_MyAccount(){
		     return  Myaccount;
		     }
}
