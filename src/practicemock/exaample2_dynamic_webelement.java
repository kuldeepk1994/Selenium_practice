package practicemock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exaample2_dynamic_webelement {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.timeanddate.com/worldclock/india/delhi");
	Thread.sleep(1000);
	String time = driver.findElement(By.xpath("(//div[@id=\"qlook\"]//span)[3]")).getText();
	Thread.sleep(3000);
	System.out.println(time);
	
}
}
