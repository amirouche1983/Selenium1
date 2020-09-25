package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {

		
		//1. alerts -- javaScript pop up to handle it we use (accept, dismiss)
		//2. file Upload pop up -- Browser Button (type = file, sendKeys(path)
		//3. Browser Window pop up -- Advertisement pop up (windowHandler API - getWindowHandles() )
	
		System.setProperty("webdriver.chrome.driver", "../Selenium1234/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//a[@class='black']")).click();

		Thread.sleep(2000);

		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();
		
		 String parentWindowId = it.next();
		 System.out.println("parent window id is : "+ parentWindowId);
		 System.out.println(" ");
		 
		 String childWindowId = it.next();
		 System.out.println("child window id is : "+ childWindowId);
		 System.out.println(" ");
		 driver.switchTo().window(childWindowId);
		 
		 Thread.sleep(2000);
		 
		 System.out.println("child window pop up title is : "+ driver.getTitle());
		 
		 driver.close();
		 System.out.println(" ");
		 driver.switchTo().window(parentWindowId);
		 System.out.println("parent window title is : "+driver.getTitle());
		 driver.quit();

	}

}
