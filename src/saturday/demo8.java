package saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo8 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://in.sugarcosmetics.com/");
	 Thread.sleep(4000);
	WebElement pop = driver.findElement(By.xpath("//i[@class=\"wewidgeticon we_close\"]"));
	
	Actions act = new Actions(driver);
	act.click(pop).perform();
			
	
}
}
