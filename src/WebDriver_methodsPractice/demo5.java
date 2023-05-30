package WebDriver_methodsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	boolean result = driver.findElement(By.xpath("//button[contains(@class,'_42ft ')]")).isEnabled();
	if(result)
	{
		System.out.println("Link is enable");
	}
	else
	{
		System.out.println("Link is not enable");
	}
}
}
