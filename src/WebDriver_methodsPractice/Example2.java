package WebDriver_methodsPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example2 {


public static void main(String[] args) throws IOException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 
	 
	 
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 File det = new File("C:\\Users\\kulde\\OneDrive\\Desktop\\testing\\Auto_practice\\Screensot\\today.jpg");
	 
	 FileHandler.copy(src, det);
}


}

