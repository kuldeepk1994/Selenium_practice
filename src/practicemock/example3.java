package practicemock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/web-table-element.php");
	 Thread.sleep(2000);
	 int rowsize = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr")).size();
	 System.out.println(rowsize);
	 System.out.println("----");
	 int colSize = driver.findElements(By.xpath("(//table[@class=\"dataTable\"]//tr)[1]//th")).size();
	 System.out.println(colSize);
	 System.out.println("------");
	String value = driver.findElement(By.xpath("//table[@class=\"dataTable\"]")).getText();
	System.out.println(value+" ! ");

}
}
