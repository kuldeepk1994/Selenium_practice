package saturday;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JioMart {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.jiomart.com/");
	 Thread.sleep(1000);
	WebElement cres = driver.findElement(By.xpath("//a[text()='Groceries']"));
	Actions act = new Actions(driver);
	Thread.sleep(1000);
	
	act.moveToElement(cres).perform();
	WebElement hc = driver.findElement(By.xpath("//a[text()='Home Care']"));
	Thread.sleep(1000);
	act.moveToElement(hc).perform();
	WebElement shoesC = driver.findElement(By.xpath("//a[@href=\"/c/groceries/home-care/shoe-care/139\"]"));
	Thread.sleep(1000);
	act.click(shoesC).perform();
	Thread.sleep(1000);
              List<WebElement> ALL = driver.findElements(By.xpath("//ul[@class=\"ais-RefinementList-list\"]"));
              Thread.sleep(1000);
              for(WebElement s1:ALL) {
            	  s1.click();
            	  break;
              }
              Thread.sleep(1000);
              driver.findElement(By.xpath("//span[@id=\"wishlist_490003095\"]")).click();
}
}
