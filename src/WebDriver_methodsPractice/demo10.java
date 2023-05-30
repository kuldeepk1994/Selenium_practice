package WebDriver_methodsPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo10 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	 Thread.sleep(2000);
	 WebElement all = driver.findElement(By.xpath("(//select[@class=\"_9407 _5dba _9hk6 _8esg\"])[2]"));
	          Select s = new Select(all);
	          s.selectByIndex(2);
	                       List<WebElement> opt = s.getOptions();
	                       System.out.println(opt.size());
	                       for(WebElement s1:opt)
	                       {
	                    	   System.out.println(s1.getText());
	                       }
	                    	   
	                    		  
	 
	 
}
}
