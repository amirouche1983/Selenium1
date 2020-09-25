package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../Selenium1234/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		Thread.sleep(300);
		driver.findElement(By.linkText("Student Discount")).click();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.linkText("LOGIN / SIGNUP"))).build().perform();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		action.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		action.moveToElement(driver.findElement(By.linkText("Member Login"))).build().perform();
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(20);
		driver.quit();
	} 

}
