package autosuggessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingMintra {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.myntra.com/fusion-wear?rf=Discount%20Range%3A50.0_100.0_50.0%20TO%20100.0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("")
		WebElement wishlist = driver.findElement(By.xpath("(//span[contains(@class,'myntraweb-sprite')])[15]"));
		
				wishlist.click();
				
					
				
		
	}
	

}
