package selenium_Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonautosugg {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("appliance");
		Thread.sleep(3000);
		
		 WebElement autosugg = driver.findElement(By.xpath("(//div[@aria-label='appliance rollers'])[1]"));
		
			autosugg.click();
				
			
		
		
		driver.close();
		
	}

}
