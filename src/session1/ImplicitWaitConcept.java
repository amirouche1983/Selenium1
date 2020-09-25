package session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../Selenium1234/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.half.ebay.com");
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();// deleting all the cookies
		//thread.sleep is a hard wait
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//dynamic wait --implicit wait for webElement after page loading
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String titale = driver.getTitle();
		System.out.println(titale); 
		driver.quit();
	} 

}
