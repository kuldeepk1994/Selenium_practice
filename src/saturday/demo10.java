package saturday;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo10 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("redmi");
	 Thread.sleep(1000);
	 List<WebElement> all = driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]/div/div"));
	 String exp = "redmi a2";
	 
	      for(WebElement s1:all) {
	    	  String act = s1.getText();
	    	  if(act.equals(exp))
	    	  {
	    		  s1.click();
	    		  break;
	    	  }
	      }
	  driver.findElement(By.xpath("(//img[@src=\"https://m.media-amazon.com/images/I/51TuDBH70FL._AC_UY218_.jpg\"])[2]")).click();
	 
	Set<String> allids = driver.getWindowHandles();
	 
	            ArrayList<String> s2 = new ArrayList<String>(allids);
	          String chilwindow = s2.get(1);
	          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	          driver.switchTo().window(chilwindow);
	          Thread.sleep(2000);
     
	          WebElement act = driver.findElement(By.xpath("//input[@name=\"submit.add-to-cart\"]"));
	          Actions s= new Actions(driver);
	          
	          s.moveToElement(act).click().perform();
	          Thread.sleep(1000);
	      
	          
	         
	          
	          
}
}
