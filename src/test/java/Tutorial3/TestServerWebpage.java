package Tutorial3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestServerWebpage {
	private static WebDriver driver;
	private static String serverBaseURL= ""
			+ "";
	private static String webpageURI= "/DemoDynamicServer/FirstServlet";
	
	@BeforeTest
	public static void configureDriver() {
		System.setProperty("webdriver.chrome.driver" ,  System.getProperty("user.home")+"/chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public static void testContent() throws InterruptedException {
		driver.get(serverBaseURL+webpageURI);
		Thread.sleep(1000);
		String expectedString= "Hi There!";
		String actualString= driver.findElement(By.id("hi")).getText();
		Assert.assertEquals(expectedString, actualString);
	}
	
	@Test //This should fail as we are asserting wrong time with that of the one shown in the page
	public static void testTime() throws InterruptedException {
		driver.get(serverBaseURL+webpageURI);
		Thread.sleep(1000);
		String actualDate= driver.findElement(By.id("date")).getText();
		Thread.sleep(1000);
		String expectedDate= "Date=Mon Oct 28 12:29:20 CET 2019";
		Assert.assertEquals(expectedDate, actualDate);
	}
	
	@AfterSuite
	public static void closeDriver() {
		driver.quit();
	}
}
