package WebDriver_methodsPractice;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo13 {


public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
	
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File det = new File("C:\\Users\\kulde\\OneDrive\\Desktop\\testing\\Auto_practice\\Screensot.m1.jpg"); 
	
		
          
	
	
	
}
}
