package saturday;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver =  new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 Thread.sleep(2000);
	// click on close btn
	 driver.findElement(By.xpath("//button[text()='✕']")).click();
	 //step 1 : 
	 WebElement login = driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]"));
	//step2: 
	 Actions act =new  Actions(driver);
	//step3: 
	 act.moveToElement(login).perform();
	 
	 
	 
	 
	 
	 
}
}
