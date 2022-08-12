package javaseleniumlibrary;

import java.time.Duration;

import javaseleniumlibrary.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationIE {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static void syncwait(int implicitWait, int explicitWait) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
		wait = new WebDriverWait(driver, Duration.ofSeconds(explicitWait));
	}
}
