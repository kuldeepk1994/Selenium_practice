package practicemock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiwebElements {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 Thread.sleep(2000);
	 List<WebElement> all = driver.findElements(By.xpath("//div"));
	 Thread.sleep(2000);
	 for(int i=0; i<=962; i=i+50)
	 {
		 System.out.println(all.get(i).getText());
	 }
}
}
