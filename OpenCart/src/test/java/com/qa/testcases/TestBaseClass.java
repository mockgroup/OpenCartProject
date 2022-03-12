package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.util.BrowserClass;
import com.qa.util.TestUtil;
import com.qa.webpages.HomePage;

public class TestBaseClass extends CommonMethod  {
	
	//WebDriver driver;
	HomePage hp;
	@BeforeClass
	  public void beforeclass() throws IOException {
	
		new TestUtil();
		driver=BrowserClass.setup("chrome"); 
		hp=new HomePage(driver);
		  
	  }
	
	@AfterClass
	public void afterclass() {
		driver.close();
	}
}
