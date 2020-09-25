package session1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementsConcept {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "../Selenium1234/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("http://www.half.ebay.com");
		driver.get("http://www.facebook.com");
		
		//1- get total count of links on the page
		//2- get the text of each link on the page
		
	List <WebElement> linkList = driver.findElements(By.tagName("a"));
	
	//size of linklist
	
	System.out.println(linkList.size());
	
	for (int i = 0; i < linkList.size(); i++) {
		
		String linkTex = linkList.get(i).getText();
		System.out.println(linkTex);
	}

	}

}
