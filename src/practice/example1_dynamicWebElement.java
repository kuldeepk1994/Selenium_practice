package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_dynamicWebElement {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("redmi note 12");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	 
	 
}
}
