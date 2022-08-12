package com.selenium.takesscreenshot;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageScreenShot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		//Archi - DownCasting the webdriver type object into TakesScreenshot Object
		//Type Casting
		TakesScreenshot ts = (TakesScreenshot)driver;
		//call the getScreenshotAs() 
		//return type Object 
		//File - File
		//Base64 - String
		//Bytes - byte[]
		//OutputType is an Selenium Interface
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		//Since JVM will delete The screen shot upon exit from the current session
		//File type printing it's absolute path by calling getAbsolutePath() - String
		System.out.println("tempFile = " + tempFile.getAbsolutePath());
		//Add coomonIO Jar to Java-Selenium Environment
		//Move the file from temp Location to Permanent location
		//Jar file will create the target screenshot folder upon Mentioning its address in 
		//File(String pathName)
		//Foldername - File Name - file type extension
		File destFile = new File("./src/test/errorscreenshots/faceBookLoginPage.png");
		
		//FileUtils is the CoomonIO Jar 
		//Copy the physical temp screen shot file to the destined location 
		FileUtils.copyFile(tempFile, destFile);
		
		//System.out.println("destFile = " + destFile.getAbsolutePath());
		driver.quit();
	}
}
