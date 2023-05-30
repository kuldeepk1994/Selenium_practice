package saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class yatra_site {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.yatra.com/");
	Thread.sleep(2000);
	
	WebElement date = driver.findElement(By.xpath("//input[@id=\"BE_flight_origin_city\"]"));
	Actions act = new Actions(driver);
	act.click(date).perform();
}
}
