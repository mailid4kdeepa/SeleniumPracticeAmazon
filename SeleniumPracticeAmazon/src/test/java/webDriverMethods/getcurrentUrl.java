package webDriverMethods;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrentUrl {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

	driver.get("https://www.amazon.com/");
			String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Prime ")).click();
 List<WebElement> links = driver.findElements(By.tagName("a"));
 
 System.out.println(links.size());
		
		System.out.println(driver.getWindowHandle());
		
		
	}

}
