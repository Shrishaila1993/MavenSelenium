package com.selenium.takesscreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShotOfWebpage {
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream(com.selenium.credentails.Credentials.commonDataFilePath);
		Properties pobj = new Properties();
		pobj.load(fis);
		if (pobj.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get(pobj.getProperty("url"));
		driver.findElement(By.id("user-name")).sendKeys(pobj.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(pobj.getProperty("password"));
		driver.findElement(By.id("login-button")).click();
		//TakesScreenShot using getScreenShotAs()
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempFilePath = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(tempFilePath.getAbsolutePath());
		driver.quit();
	}
}
