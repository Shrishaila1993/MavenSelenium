package com.selenium.takesscreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageTakesScreenShotWithLocalDateTime {
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		LocalDateTime ldt = LocalDateTime.now();
		String timeStamp = ldt.toString().replace(':', '-');
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
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempFilePath = ts.getScreenshotAs(OutputType.FILE);
		File destFilePath = new File("./src/test/errorscreenshots/SwagLab"+timeStamp+".png");
		FileUtils.copyFile(tempFilePath, destFilePath);
		driver.quit();

	}
}
