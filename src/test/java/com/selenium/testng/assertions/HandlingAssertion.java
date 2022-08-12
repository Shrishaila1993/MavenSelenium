package com.selenium.testng.assertions;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import javaseleniumlibrary.BrowserLaunch;

public class HandlingAssertion extends BrowserLaunch{
	@Test
	public void LaunchActiTime() {
		launch("chrome");
		syncwait(10, 10);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("managerr");
		driver.findElement(By.id("loginButton")).click();
		
		//URL assertion
		//Error message assertion
		
	}
}
