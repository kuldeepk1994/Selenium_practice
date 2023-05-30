package saturday;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_pop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name=\"alert\"]")).click();
	Thread.sleep(2000);
//	Alert alert = driver.switchTo().alert();
//	 System.out.println(alert.getText());
//	 alert.accept();
	 driver.findElement(By.xpath("//input[@value=\"Prompt\"]")).click();
	 Alert alert1 = driver.switchTo().alert();
	 alert1.sendKeys("kuldeep");
	 Thread.sleep(2000);
	 alert1.accept();
}
}
