package com.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethod {

	WebDriver driver;

//	public CommonMethod(WebDriver ldriver) {
//		this.driver = ldriver;
//	}

	public void click(WebElement element) {
		boolean result = element.isDisplayed();
		if (result == true) {
			System.out.println("Element Visible For :" + element.getText());
			element.click();
			System.out.println("Successfully Click On :" + element.getAccessibleName());
		} else {
			System.out.println("Element Is Not Visible.");
		}
	}
}
