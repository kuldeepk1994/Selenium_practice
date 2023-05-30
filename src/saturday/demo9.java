package saturday;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class demo9 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/");

	 driver.findElement(By.xpath("//span[text()='From']")).click();
	 Thread.sleep(2000);
	 //driver.findElement(By.xpath("//span[@class=\"ic_circularclose_grey\"]")).click();
	// Thread.sleep(2000);
	 WebElement all = driver.findElement(By.xpath("//ul[@role=\"listbox\"]/li"));
	Select s = new Select(all);
	
	           List<WebElement> opt = s.getOptions();
	           for(WebElement a1:opt)
	           {
	        	   System.out.println(a1.getText());
	           }
			
    
	
}
}