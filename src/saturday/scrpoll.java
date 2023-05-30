package saturday;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Handler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class scrpoll {
public static void main(String[] args) throws InterruptedException, IOException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("fan");
	Thread.sleep(2000);
	List<WebElement> all = driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]/div/div"));
	Thread.sleep(2000);
	           driver.findElement(By.xpath("//div[@aria-label=\"fan small\"]")).click();
	           Thread.sleep(1000);
	           driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]")).click();
	          Set<String> allid = driver.getWindowHandles(); 
	          Thread.sleep(1000);
	          ArrayList<String> allids = new ArrayList<String>(allid);
	          String childWindow = allids.get(1);
	          
	          driver.switchTo().window(childWindow);
	          driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
	         
	          Thread.sleep(4000);
	      WebElement target = driver.findElement(By.xpath("//div[@class=\"nav-logo-base nav-sprite\"]"));
	         Thread.sleep(3000);
	         ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",target);
	         Thread.sleep(5000);
	         File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	         
	         File det = new File("C:\\Users\\kulde\\OneDrive\\Desktop\\testing\\screenshot\\k2.jpg");
	         
	         FileHandler.copy(src, det);
	         WebElement target2 = driver.findElement(By.xpath("//a[@href=\"/cart?ref_=sw_gtc\"]"));
	         Thread.sleep(2000);
	         ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",target2);
	         Actions act = new Actions(driver);
	         Thread.sleep(2000);
	         act.moveToElement(target2).click().perform();
	         Thread.sleep(1000);
	        File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
	       File det2 = new File("C:\\Users\\kulde\\OneDrive\\Desktop\\testing\\screenshot\\k2.jpg");
	         
	          FileHandler.copy(src2, det2);
	       
	       driver.quit();
	    
}
}