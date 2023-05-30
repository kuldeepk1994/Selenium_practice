package saturday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_keyboard_actions {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	
	
	WebElement electronic = driver.findElement(By.xpath("//div[text()='Electronics']"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(electronic).perform();
	Thread.sleep(2000);
	WebElement cam = driver.findElement(By.xpath("(//a[contains(@href,\"https://www.flipkart.com/camera-clp-store?otracker=nmenu_sub_Electronics_0_Camera&fm=neo%2Fmerchandising\")])[1]"));
	Thread.sleep(1000);
	act.moveToElement(cam).perform();
	Thread.sleep(2000);
	WebElement dslr = driver.findElement(By.xpath("//a[contains(@href,\"https://www.flipkart.com/cameras/dslr-mirrorless/pr?sid=jek,p31,\")]"));
Thread.sleep(2000);
act.click(dslr).perform();

Thread.sleep(2000);
      WebElement min = driver.findElement(By.xpath("//select[@class=\"_2YxCDZ\"]"));
      Thread.sleep(2000);
      act.click(min).perform();
      Thread.sleep(2000);
      for(int i=1; i<=3; i++)
      {
    	  act.sendKeys(Keys.ARROW_DOWN).perform();
    	  Thread.sleep(2000);
      }
      act.sendKeys(Keys.ENTER).perform();
}
}
