package saturday;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addToCart_amazon {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("tv");
	Thread.sleep(2000);
	List<WebElement> all = driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]//div"));
	String exp = "tv 43+ inch";
	Thread.sleep(2000);
	for(WebElement a1:all)
	{
		String act = a1.getText();
		if(act.equals(exp)) {
			a1.click();
			break;
		}
	}
		
	
}
}
