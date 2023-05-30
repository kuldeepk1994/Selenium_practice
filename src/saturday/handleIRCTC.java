package saturday;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleIRCTC {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.irctc.co.in/nget/train-search");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@type=\"text\"]")).click();
	 Thread.sleep(1000);
	  List<WebElement> list = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
	  String exp = "PUNE JN - PUNE";
	  
	  for(WebElement a1:list)
	  {
		  String act = a1.getText();
		  if(act.equals(exp))
		  {
			  a1.click();
			  break;
		  }
	  }
//	  Thread.sleep(1000);
//	  driver.findElement(By.xpath("(//input[@role=\"searchbox\"])[2]")).click();
	  //driver.findElements(By.xpath(""))
}
}
