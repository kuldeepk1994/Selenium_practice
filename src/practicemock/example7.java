package practicemock;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import saturday.file;

public class example7 {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File det = new File("C:\\Users\\kulde\\OneDrive\\Desktop\\testing\\screenshot\\kd1.jpg");
	
	FileHandler.copy(src, det);
	
}
}
