package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "../Selenium1234/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://scgi.half.ebay.com/ws/eBayISAP.dll?RegisterEnterInfo&usage=2943&ru=");

		// https://scgi.half.ebay.com/ws/eBayISAP.dll?RegisterEnterInfo&usage=2943&ru=

		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Tom");
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Peter");
		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("12, new street");
		driver.findElement(By.xpath("//*[@id='address2']")).sendKeys("34th ave ");
		driver.findElement(By.id("city")).sendKeys("New York");
		// driver.findElement(By.name("state")).click();
		Select select = new Select(driver.findElement(By.id("state")));
		select.selectByVisibleText("New York");

		driver.findElement(By.cssSelector("#dayphone1")).sendKeys("347");
		// driver.findElement(By.linkText("Sign in")).click();

		driver.findElement(By.id("zip")).sendKeys("11372");
		driver.findElement(By.id("dayphone2")).sendKeys("567");
		driver.findElement(By.id("dayphone3")).sendKeys("8477");
		driver.findElement(By.id("dayphone4")).sendKeys("122");
		Random rand = new Random();
		int regNumber = rand.nextInt(1000);
		String email = ("amar_djebra" + regNumber + "@hotmail.com");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("retype_email")).sendKeys(email);

		driver.findElement(By.id("userid")).sendKeys("Amirouche" + regNumber);
		driver.findElement(By.id("PASSWORD")).sendKeys("Amirouche1983");
		driver.findElement(By.id("rpass")).sendKeys("Amirouche1983");

		Select select1 = new Select(driver.findElement(By.id("SECRET_QUESTION")));
		select1.selectByVisibleText("What is your pet's name?");
		driver.findElement(By.id("SECRET_ANSWER")).sendKeys("Boubit");

		Select select2 = new Select(driver.findElement(By.id("birthdate2")));
		select2.selectByVisibleText("September");
		Select select3 = new Select(driver.findElement(By.id("birthdate1")));
		select3.selectByVisibleText("19");
		Select select4 = new Select(driver.findElement(By.id("birthdate3")));
		select4.selectByVisibleText("1983");
		driver.findElement(By.id("acceptq1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='continue']")).click();
		String titel = driver.getTitle();
		System.out.println(titel);
		// driver.quit();
	}

}
