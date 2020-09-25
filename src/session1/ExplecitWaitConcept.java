package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplecitWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../Selenium1234/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.facebook.com");
		
		clickOn(driver, driver.findElement(By.xpath("//button[@id='u_0_13']")), 5);
		clickOn(driver, driver.findElement(By.xpath("//input[starts-with(@id,'u_0_')]")), 20);
		

	}

	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {

		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}

}
