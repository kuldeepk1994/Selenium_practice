package saturday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pop {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[text()='✕']")).click();
	 Thread.sleep(2000);
	WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
	Thread.sleep(2000);
	Actions act = new Actions(driver);
	act.moveToElement(fashion).perform();
	Thread.sleep(2000);
	WebElement next = driver.findElement(By.xpath("(//a[contains(@href,\"https://www.flipkart.com/clothing-and-accessories/~cs-ahd69o77qf/pr?sid=clo&collection\")])[1]"));
act.moveToElement(next).perform();
Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@href,\"https://www.flipkart.com/womens-jeans\")]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[contains(@href,\"/kotty-regular-women-black\")])[3]")).click();
        Thread.sleep(2000);
       Set<String> all = driver.getWindowHandles();
       ArrayList<String> allids = new ArrayList<String>(all);
                      String windowid = allids.get(1);
       driver.switchTo().window(windowid);
       
       
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Add to cart']")).click();


}
}