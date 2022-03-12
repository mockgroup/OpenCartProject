package com.qa.util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void implicitewait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void explicitewait(WebElement element,WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement localelement=wait.until(ExpectedConditions.visibilityOf(element));
		localelement.click();
	}
}
