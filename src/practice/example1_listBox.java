package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_listBox {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	 Thread.sleep(2000);
	 WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	 month.click();
	Select s = new Select(month);
	Thread.sleep(1000);
	s.selectByIndex(2);
	Thread.sleep(2000);
	
	List<WebElement> allmonths = s.getOptions();
	System.out.println(allmonths.isEmpty());
	System.out.println(allmonths.size());
	
	for(WebElement s1:allmonths) {
		System.out.println(s1.getText());
	}
	
}
}
