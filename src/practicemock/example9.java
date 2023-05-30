package practicemock;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example9 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
driver.get("https://www.amazon.in/s?k=redmi+note+12&crid=27VUOSNSBHCHX&sprefix=%2Caps%2C1319&ref=nb_sb_ss_recent_1_0_recent");
Thread.sleep(1000);
driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]")).click();
Thread.sleep(1000);
Set<String> all = driver.getWindowHandles();
Thread.sleep(1000);
ArrayList<String> allids = new ArrayList<String>(all);
Thread.sleep(1000);
String childwindow = allids.get(1);

driver.switchTo().window(childwindow);

driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();

String mainp = allids.get(0);

driver.switchTo().window(mainp);
Thread.sleep(2000);

driver.findElement(By.xpath("//span[@aria-hidden=\"true\"]")).click();
	
	
	
	
	
}
}
