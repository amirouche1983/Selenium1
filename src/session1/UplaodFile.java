package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UplaodFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../Selenium1234/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();// lunch chrome
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='fileupload']"))
		.sendKeys("Test cases/EXCEL TEST CASES.xlsx path");
	driver.findElement(By.id("fileupload")).sendKeys("/EXCEL TEST CASES.xlsx Path");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//Alert alert = driver.switchTo().alert();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[@class='pm-cta pm-cancel-btn']")).click();
	//driver.quit();

	}
 
}
