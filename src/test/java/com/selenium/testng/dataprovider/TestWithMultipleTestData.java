package com.selenium.testng.dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestWithMultipleTestData {
	WebDriver driver;
	static String browser = "chrome";
	@Test(dataProvider = "loginCredentials")
	public void launchApplication(String username, String password) {
		switch ("chrome") {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.quit();
	}
	@DataProvider(name = "loginCredentials")
	@Test()
	public Object[][] loginData() {
		// TODO Auto-generated method stub
		Object[][] data=new Object[4][2];
		data[0][0]= "standard_user";
		data[0][1]= "secret_sauce";
		data[1][0]= "locked_out_user";
		data[1][1]= "secret_sauce";
		data[2][0]= "problem_user";
		data[2][1]= "secret_sauce";
		data[3][0]= "performance_glitch_user";
		data[3][1]= "secret_sauce";
		return data;
		
	}
}
