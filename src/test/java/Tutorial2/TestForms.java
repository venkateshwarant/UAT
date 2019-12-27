package Tutorial2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestForms {
	private static WebDriver driver;
	private static String firstName= "Venkateshwaran";
	private static String lastName= "Thamilselvan";
	private static String serverBaseURL="http://127.0.0.1:3000";
	@BeforeTest
	public static void configureDriver() {
		System.setProperty("webdriver.chrome.driver" ,  System.getProperty("user.home")+"/chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public static void testFirstNameField() throws InterruptedException {
		driver.get(serverBaseURL+"/Tutorial1/helloworld.html");
		Thread.sleep(1000);
		driver.findElement(By.id("firstname")).sendKeys(firstName);
		Thread.sleep(1000);
		String fNameInForm = driver.findElement(By.id("firstname")).getAttribute("value");
		Assert.assertEquals(firstName, fNameInForm);
	}
	
	/*
	 * @Test //This should fail as we are asserting lastname field value with the
	 * firstname value public static void testLastNameField() throws
	 * InterruptedException { driver.get("file:///"+System.getProperty("user.dir")+
	 * "/src/main/java/Tutorial2/forms.html"); Thread.sleep(1000);
	 * driver.findElement(By.id("lastname")).sendKeys(lastName); Thread.sleep(1000);
	 * String lNameInForm =
	 * driver.findElement(By.id("lastname")).getAttribute("value");
	 * Assert.assertEquals(firstName, lNameInForm); }
	 */
	
	@Test 
	public static void testRadioButton() throws InterruptedException {
		driver.get(serverBaseURL+"/Tutorial2/forms.html");
		Thread.sleep(1000);
		driver.findElement(By.id("firstname")).sendKeys("Clara");
		driver.findElement(By.id("lastname")).sendKeys("Johnson");
		driver.findElement(By.id("f")).click();
		Thread.sleep(1000);
		Boolean isFemaleSelected = driver.findElement(By.id("f")).isSelected();
		Assert.assertTrue( isFemaleSelected);
	}
	
	@Test 
	public static void testSubmitButton() throws InterruptedException {
		driver.get(serverBaseURL+"/Tutorial2/forms.html");
		Thread.sleep(1000);
		driver.findElement(By.id("firstname")).sendKeys("Clara");
		driver.findElement(By.id("lastname")).sendKeys("Johnson");
		driver.findElement(By.id("f")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Assert.assertEquals( "Hi "+"Clara", driver.findElement(By.id("holder")).getText());
	}
	@AfterSuite
	public static void closeDriver() {
		driver.quit();
	}
	
}
