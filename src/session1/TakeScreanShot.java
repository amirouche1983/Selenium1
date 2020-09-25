package session1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TakeScreanShot {

	public static void main(String[] args)throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "../Selenium1234/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		 driver.get("http://www.google.com");
		 //take a screenshot and store it as a file format
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		 // now copy the screenshot  to desired location using copyFile //method 
		 FileUtils.copyFile(src,new File("../Selenium1234/src/session1//google.png"));
		// FileUtils.copyFile(src,new File("/Users/amardjebra/eclipse-workspace/Selenium/src/session1//google.mpg"));
		 driver.quit();
	} 

}
