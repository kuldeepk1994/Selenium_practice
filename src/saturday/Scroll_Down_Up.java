package saturday;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Down_Up {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);

     //scroll down --> 1st parameter: 0 and 2nd parameter : +ve
	 
((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 350)");

Thread.sleep(2000);
//scroll up --> 1st parameter: 0 and 2nd parameter : -ve
((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-350)");

// scroll Right : 1st parameter: +ve , 2nd paraameter: 0

}
}
