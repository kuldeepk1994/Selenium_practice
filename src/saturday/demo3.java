package saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.bigbasket.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type=\"text\"])[7]")).sendKeys("refined");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[contains(@href,\"/pd/274148/fortune-sun-lite-sunflower\")]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='ADD TO BASKET']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='My Basket']")).click();
	
	
	
}
}
