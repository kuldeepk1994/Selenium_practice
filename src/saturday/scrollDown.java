package saturday;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;import io.opentelemetry.sdk.internal.JavaVersionSpecific;

public class scrollDown {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.bigbasket.com/");
	Thread.sleep(2000);
	WebElement targ = driver.findElement(By.xpath("//h4[text()='Download Our App']"));
	Thread.sleep(2000);
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",targ);
	Thread.sleep(1000);
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Thread.sleep(2000);
	File det = new File("C:\\Users\\kulde\\OneDrive\\Desktop\\testing\\screenshot\\k1.jpg");
	Thread.sleep(1000);
	FileHandler.copy(src, det);
	Thread.sleep(2000);
	WebElement target1 = driver.findElement(By.xpath("//input[@id=\"input\"]"));
	Thread.sleep(2000);
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",target1);
}
}
