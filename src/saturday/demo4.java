package saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo4 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.bigbasket.com/");
	 WebElement category = driver.findElement(By.xpath("//a[@class=\"dropdown-toggle meganav-shop\"]"));
	 Actions act = new Actions(driver);
	            act.moveToElement(category).perform();
	            Thread.sleep(2000);
	           WebElement kitchen = driver.findElement(By.xpath("(//a[@href=\"/cl/kitchen-garden-pets/?nc=nb\"])[2]"));
	           act.moveToElement(kitchen).perform();
	           driver.findElement(By.xpath("(//a[@ng-href=\"/pc/kitchen-garden-pets/storage-accessories/?nc=nb\"])[2]")).click();
}
}
