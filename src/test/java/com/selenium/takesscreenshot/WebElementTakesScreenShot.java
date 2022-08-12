package com.selenium.takesscreenshot;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementTakesScreenShot {
	public static void main(String[] args) throws Throwable {
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		File loginButtonScreenShot = loginButton.getScreenshotAs(OutputType.FILE);
		File destFilePath = new File("./src/test/errorscreenshots/SwagLab"+timeStamp+".png");
		FileUtils.copyFile(loginButtonScreenShot, destFilePath);
		
	}
}
