package saturday;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo6 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@data-cy=\"handleSnackbarClose\"]")).click();
	Thread.sleep(2000);
	WebElement all = driver.findElement(By.xpath("//input[@class=\"rsw_inputField font30 latoBlack\"]"));
	Select s = new Select(all);
	        List<WebElement> opt = s.getOptions();
	        
	        System.out.println(opt.size());
	        
	        for(WebElement a1:opt)	        {
	        	System.out.println(a1.getText());
	        }
	         
}
}
