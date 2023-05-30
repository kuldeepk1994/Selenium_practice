package saturday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo14 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement date = driver.findElement(By.xpath("//select[@title=\"Day\"]"));
	Actions act = new Actions(driver);
	act.click(date).perform();
	for(int i=1; i<=5; i++)
	{
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
	}
	act.sendKeys(Keys.ENTER).perform();
			
}
}
