package Tutorial1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver" ,  "/Users/venkat/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //maximize
		driver.manage().window().maximize();
		driver.get("file:///Users/venkat/Documents/Atom/helloworld.html");
//		driver.get("https://www.google.com");

		Thread.sleep(1000);
		
    }
}
