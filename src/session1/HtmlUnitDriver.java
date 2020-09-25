package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HtmlUnitDriver {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "../Selenium1234/Drivers/chromedriver");
		 WebDriver driver = new ChromeDriver();

		// htmlUnitDriver is not ava
		//WebDriver driver = new org.openqa.selenium.htmlunit.HtmlUnitDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.freecrm.com");
		String title = driver.getTitle();
		System.out.println("Title Before login is :" + title);
		driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']")).click();
		// Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("djebra29@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Amirouche1983");
		// Thread.sleep(300);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		String title1 = driver.getTitle();
		System.out.println("Title After login is :" + title1);
		driver.quit();
	}

}
