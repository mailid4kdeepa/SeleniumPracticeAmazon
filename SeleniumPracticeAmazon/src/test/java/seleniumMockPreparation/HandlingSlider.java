package seleniumMockPreparation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingSlider {
	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//implicitwaits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.com/events/bigspringsale?ref_=nav_cs_gb");
		
		WebElement slider = driver.findElement(By.xpath("//input[@aria-label='Maximum discount']"));
		
		Point before = slider.getLocation();
		System.out.println(before);
		
		
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
		
		
		act.moveToElement(slider).clickAndHold(slider).moveByOffset(80,0).release().perform();
		
		Point after = slider.getLocation();
		System.out.println(after);
		
	}

}
