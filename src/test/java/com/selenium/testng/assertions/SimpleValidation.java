package com.selenium.testng.assertions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import javaseleniumlibrary.BrowserLaunch;

public class SimpleValidation extends BrowserLaunch{
	@Test
	public void launchAndLogin() {
		launch("chrome");
		syncwait(10, 10);
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "mismatch the title.");
		driver.quit();
	}
}
