package com.selenium.testng.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javaseleniumlibrary.BrowserLaunch;

public class AnnotationWithPriority extends BrowserLaunch {
	@BeforeClass
	public void launchbrowser() {
		launch("chrome");
		syncwait(10, 10);
		System.out.println("The browser launched");
	}
	@Test (priority = 1)
	public void loginswaglab() {
		syncwait(10, 10);
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);
		System.out.println("Login to swag lab application");
	}
	@Test(priority = 2)
	public void logoutswaglab() {
		syncwait(10, 10);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		System.out.println("Logout to swag lab application");
	}
	@Test(priority = 3)
	public void loginactitime() {
		syncwait(10, 10);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Login to actitime application");
	}
	@AfterClass
	public void logoutactitime() {
		syncwait(10, 10);
		driver.findElement(By.id("logoutLink")).click();
		System.out.println("Logout to actitime application");
		driver.quit();
		System.out.println("Terminate the current session");
	}
	
}
