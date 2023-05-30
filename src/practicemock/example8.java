package practicemock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("kuldeep");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	Thread.sleep(2000);
	String txt = driver.switchTo().alert().getText();
			System.out.println(txt);
}
}
