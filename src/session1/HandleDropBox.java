package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../Selenium1234/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAP.dll?RegisterEnterInfo&usage=2943&ru=");

		Select select = new Select(driver.findElement(By.id("state")));

		select.selectByVisibleText("Armed Forces (AP)");

	}

}
