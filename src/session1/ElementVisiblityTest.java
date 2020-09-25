package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ElementVisiblityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../Selenium1234/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 driver.get("https://register.freecrm.com/register/");// enetr URL
		 
		 //1. isDisplayed() method : applicable for all the element
		 
		 boolean b1 = driver.findElement(By.name("action")).isDisplayed();//for sign up button
		 System.out.println(b1);// true or false
		 
	}

}
