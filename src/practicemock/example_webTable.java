package practicemock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_webTable {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.cricbuzz.com/cricket-series/5945/indian-premier-league-2023/points-table");
	Thread.sleep(2000);
	int rowSize = driver.findElements(By.xpath("//table[@class=\"table cb-srs-pnts\"]//tr")).size();
	System.out.println(rowSize);
	System.out.println("----");
	Thread.sleep(2000);
	int cols = driver.findElements(By.xpath("//table[@class=\"table cb-srs-pnts\"]//tr[@class=\"cb-srs-gray-strip \"]")).size();
	System.out.println(cols);
}
}
