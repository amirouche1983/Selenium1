package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "../Selenium1234/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();// lunch chrome

		driver.manage().window().maximize();// maximize the window
		driver.manage().deleteAllCookies();// delete all the cookies
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/");// enter URL
		driver.findElement(By.xpath("//*[@class='icon icon-xs mdi-chart-bar']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("djebra29@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Amirouche1983");

		Thread.sleep(300);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		/////////
		driver.findElement(By.xpath("//button[@class='ui red button']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Contact')]")).click();
		driver.findElement(By.xpath("//div[@name='view']")).click();

//				Alert alert = driver.switchTo().alert();
//				alert.accept();//click on ok btn

		// driver.switchTo().frame("mainpanel");

		// driver.findElement(By.xpath("//a[conatains(text(),'Contacts')]")).click();

		// button[@class='ui red button']

	}
}
