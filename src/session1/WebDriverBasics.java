package session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
//		1. firefox browser
//	 	geckodriver
//	  C:\\downlaods\\geckodriver.exe----windows
		
		System.setProperty("webdriver.gecko.driver", "../Selenium1234/Drivers/geckodriver");
		WebDriver driver1 = new FirefoxDriver();
		//WebDriver driver1 = new org.openqa.selenium.htmlunit.HtmlUnitDriver();
		driver1.get("http://www.google.com");
		String tittle1 = driver1.getTitle();
		
		System.out.println(tittle1);
		
		//validation point
		
		if (tittle1.equals("Google")) {
			System.out.println("correct tittle");
			
		}else {
			System.out.println("in-correct tittle");
		}
		
		System.out.println(driver1.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver1.quit();
		
		System.setProperty("webdriver.chrome.driver", "../Selenium1234/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new org.openqa.selenium.htmlunit.HtmlUnitDriver();
		driver.get("http://www.google.com");
		String tittle = driver.getTitle();
		
		System.out.println(tittle);
		
		//validation point
		
		if (tittle.equals("Google")) {
			System.out.println("correct tittle");
			
		}else {
			System.out.println("in-correct tittle");
		}
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.quit();
		
	}

}
