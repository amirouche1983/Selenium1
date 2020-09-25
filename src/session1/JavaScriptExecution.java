package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class JavaScriptExecution {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../Selenium1234/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://classic.crmpro.com");// enter URL
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		//driver.get("https://ui.freecrm.com/");// enter URL

		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("djebra29@gmail.com");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Amirouche1983");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("djebra29@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Amirouche1983");
		
		// driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

		 WebElement loginBtn =driver.findElement(By.xpath("//input[contains(@type,'submit')]"));

		//WebElement loginBtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));

		flash(loginBtn, driver);// highlight the element

		drawBorder(loginBtn, driver);// draw a boarder

		// take a screen shot
		// File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copyFile //method
		// FileUtils.copyFile(src,new
		// File("/Users/amardjebra/eclipse-workspace/Selenium/src/session1//freecrm.png"));
		// generate Alert
		// generateAlert(driver, "tere is issue with login button on login page");

		
		
		//click on any element by using javaScipte executor
		clickElementByJS(loginBtn, driver);
		//Thread.sleep(2000);
		//get the page text
		 System.out.println(getPageInnerText(driver));
		//refresh the page
		//1. by using selenium
		//driver.navigate().refresh();
		//refreshBrowserByJS(driver);
		
		//get the title of the page by using js
		System.out.println( getTitleByJS (driver));
		//Thread.sleep(3000);
		//scroll the page down by using js
		//scrollPageDown(driver);
		
		//scroll into view the element
     WebElement forgetPassword  = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
		scrollIntoView(forgetPassword, driver);
	
	}

	public static void flash(WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		System.out.println(bgcolor);
		for (int i = 0; i < 100; i++) {
			changeColor("rgb(0,200,0)", element, driver);// 1
			changeColor(bgcolor, element, driver);// 2

		}

	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {

		}
	}

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border = '3px solid red'", element);//16px

	}

	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");

	}

	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);

	}
	
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");

	}
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}
	public static void scrollIntoView(WebElement element ,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

}
