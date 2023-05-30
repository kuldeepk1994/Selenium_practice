package saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo16 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.tripodeal.com/");
	Thread.sleep(2000);
	WebElement det = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	Thread.sleep(2000);
	Actions act = new Actions(driver);
	act.click(det).perform();
	Thread.sleep(2000);
	for(int i=1;i<=5; i++)
	{
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
	}act.sendKeys(Keys.ENTER).perform();
	
}
}
