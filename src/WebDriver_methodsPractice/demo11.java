package WebDriver_methodsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo11 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	 Thread.sleep(2000);
	 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name=\\\"iframeResult\\\"]")));
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	 
	 
}
}
