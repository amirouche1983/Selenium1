package session1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpsHandle {

	public static void main(String[] args) throws InterruptedException {
		//https://mail.rediff.com/cgi-bin/login.cgi
		System.setProperty("webdriver.chrome.driver", "../Selenium1234/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");//lunch chrome
		
		
		driver.findElement(By.name("proceed")).click();//click on ok btn
		
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		
//		System.out.println(alert.getText());
//		String text = alert.getText();
//	if (text.equals("Please enter a valid user name")) {
//		System.out.println("correct mesg");
//	}else {
//		System.out.println("in-correct mesg");
//	}
//		alert.accept();//click on ok btn
//		//alert.dismiss();//click on cancel btn
//		
//		
//		driver.close();
	}
	

}
