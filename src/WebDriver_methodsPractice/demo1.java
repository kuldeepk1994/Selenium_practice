package WebDriver_methodsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
     
	
}
}
