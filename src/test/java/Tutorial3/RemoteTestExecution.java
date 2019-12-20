package Tutorial3;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RemoteTestExecution {
private static WebDriver driver;

	/*@BeforeTest
	public static void configureDriver() throws MalformedURLException {
//		System.setProperty("webdriver.chrome.driver" ,  System.getProperty("user.home")+"/chromedriver");
			DesiredCapabilities capability1 = DesiredCapabilities.firefox();
			capability1.setBrowserName("firefox");
			capability1.setPlatform(Platform.MAC);
			driver = new RemoteWebDriver(new URL("http://192.168.33.1:4444/wd/hub"), capability1);
	}
	*/
	 
	
/* @BeforeTest
	public static void configureDriver() throws MalformedURLException {
//		System.setProperty("webdriver.chrome.driver" ,  System.getProperty("user.home")+"/chromedriver");
		final ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
			DesiredCapabilities capability1 = DesiredCapabilities.chrome();
			capability1.setBrowserName("chrome");
			capability1.setPlatform(Platform.MAC);
			capability1.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

			driver = new RemoteWebDriver(new URL("http://192.168.33.1:4446/wd/hub"), capability1);
	}	
	*/

@BeforeTest
public static void configureDriver() throws MalformedURLException {
//	System.setProperty("webdriver.chrome.driver" ,  System.getProperty("user.home")+"/chromedriver");
	final ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("--headless");
	chromeOptions.addArguments("--no-sandbox");
	chromeOptions.addArguments("--disable-dev-shm-usage");
	chromeOptions.addArguments("--window-size=1200x600");

	chromeOptions.setBinary("/usr/bin/google-chrome");
		DesiredCapabilities capability1 = DesiredCapabilities.chrome();
		capability1.setBrowserName("chrome");
		capability1.setPlatform(Platform.LINUX);

		capability1.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

		driver = new RemoteWebDriver(new URL("http://192.168.33.13:4444/wd/hub"), capability1);
}	


	/*@BeforeTest
	public static void configureDriver() throws MalformedURLException {
//		System.setProperty("webdriver.chrome.driver" ,  System.getProperty("user.home")+"/chromedriver");
		final FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.addArguments("--headless");
			DesiredCapabilities capability1 = DesiredCapabilities.firefox();
			capability1.setBrowserName("firefox");
			capability1.setPlatform(Platform.LINUX);
			capability1.setCapability(FirefoxOptions.FIREFOX_OPTIONS, firefoxOptions);

			driver = new RemoteWebDriver(new URL("http://192.168.33.11:4445/wd/hub"), capability1);
	}*/
	
	@Test
	public static void testGoogleSearch() throws InterruptedException {
		driver.get("http://192.168.33.10/helloworld.html");
		System.out.println(driver.findElement(By.id("hello")).getText());
		Assert.assertEquals("Hello world!", driver.findElement(By.id("hello")).getText());
		Thread.sleep(1000);
	}
	@AfterTest
	public static void closeDriver() {
		driver.quit();
	}
}
