package com.selenium.testng.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javaseleniumlibrary.*;

public class HandlingSwagLabWithTestNG extends BrowserLaunch{
	@BeforeClass
	public void launchbrowser() {
		launch("chrome");
		syncwait(10, 10);
	}
	@Test
	public void loginswaglab() {
		syncwait(10, 10);
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);
	}@AfterClass
	public void logoutswaglab() {
		syncwait(10, 10);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		driver.quit();
	}
}
