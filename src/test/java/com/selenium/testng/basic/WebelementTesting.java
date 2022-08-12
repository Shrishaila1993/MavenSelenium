package com.selenium.testng.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javaseleniumlibrary.*;

public class WebelementTesting extends BrowserLaunch {
	@BeforeClass
	public void launchbrowser() {
		launch("chrome");
		syncwait(10, 10);
		System.out.println("The browser launched");
	}
	@Test(priority = 1)
	public void checkboxTest() {
		syncwait(10, 10);
		driver.get("https://demoqa.com/checkbox");
		WebElement homeCheckBox = driver.findElement(By.className("rct-title"));
		homeCheckBox.click();
		System.out.println("The checkboxtest is completed");
	}
	@Test(priority = 2)
	public void linkTest() {
		syncwait(10, 10);
		driver.get("https://demoqa.com/links");
		WebElement simpleLink = driver.findElement(By.linkText("Home"));
		simpleLink.click();
		System.out.println("The linktest is completed");
	}
	@Test(priority = 3)
	public void partiallinkTest() {
		syncwait(10, 10);
		driver.get("https://demoqa.com/links");
		WebElement dynamicLink = driver.findElement(By.partialLinkText("Home"));
		dynamicLink.click();
		System.out.println("The partiallinktest is completed");
	}
	@AfterClass
	public void closewindow() {
		driver.quit();
	}
}
