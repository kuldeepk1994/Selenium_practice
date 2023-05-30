package practicemock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.angelone.in/");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//button[@id=\"wzrk-cancel\"]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@class=\"ct-close-popup\"]")).click();
	 Thread.sleep(1000);
	 //driver.findElement(By.xpath("//button[@id=\"wzrk-cancel\"]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//a[@href=\"/stocks/a\"])[1]")).click();
}
}
