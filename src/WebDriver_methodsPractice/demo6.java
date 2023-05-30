package WebDriver_methodsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	boolean result = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]")).isDisplayed();
	if(result)
	{
		System.out.println("Link is Display");
	}
	else
	{
		System.out.println("Link is not Display");
	}
	
	
}
 
}
