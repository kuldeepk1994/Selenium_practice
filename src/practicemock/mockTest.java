package practicemock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class mockTest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	Thread.sleep(2000);
	WebElement all = driver.findElement(By.xpath("//select"));
	Thread.sleep(1000);
	all.click();
	Select s = new Select(all);
	s.selectByValue("IND");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ins[@style=\"display: inline-block; width: 728px; height: 90px;\"]")).click();
	

	         
	
}
}
