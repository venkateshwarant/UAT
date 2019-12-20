package Tutorial1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGoogleSearchEngine {
	private static WebDriver driver;
	
	@BeforeTest
	public static void configureDriver() {
		System.setProperty("webdriver.chrome.driver" ,  System.getProperty("user.home")+"/chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test(groups = { "include-test-one" })
	public static void testHelloWorld() throws InterruptedException {
		driver.get("file:///Users/venkat/Documents/Atom/helloworld.html");
		Thread.sleep(1000);
		Assert.assertEquals("Hello world!", driver.findElement(By.id("hello")).getText());
	}
	
	@Test(groups = { "include-test-two" })
	public static void testGoogleSearch() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(1000);
	}
	@AfterSuite
	public static void closeDriver() {
		driver.quit();
	}
}
