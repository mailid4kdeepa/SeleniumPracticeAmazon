package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attributes {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.com/");
	Thread.sleep(1000);
  WebElement search = driver.findElement(By.xpath("//input[contains(@placeholder,'Search ')]"));
  search.sendKeys("dress");
  search.clear();
  
  driver.findElement(By.xpath("//span[starts-with(text(),'Sign')]")).click();
	
}
}
