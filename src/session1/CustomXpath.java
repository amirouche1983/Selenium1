package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../Selenium1234/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.half.ebay.com");
		
    	driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("java");
//		driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).click();
		
		//driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("java");
		
		//use xpath with: contains()or // use xpath with: starts-with
		
		//dynamic id : div
		//id = password123
		//id = password487
		//id = password984
		
		
//		driver.findElement(By.xpath("//div[contains(@id,'password')]")).sendKeys("java");
//		driver.findElement(By.xpath("//div[starts-with(@id,'password')]")).sendKeys("java");
//		
		// use xpath with: ends-with
		
		// id = 123_password
		//id = 932_password
		//id = pass_pass_password
		
	//	driver.findElement(By.xpath("//div[ends-with(@id,'_password')]")).sendKeys("java");
		
		
		//for links: custom xpath
    	//all the links are represented with <a> html tag:
    	
    	driver.findElement(By.xpath("//a[contains(text(),' Help & Contact')]")).click();
		
		
		driver.close();
		
		
	}

}
