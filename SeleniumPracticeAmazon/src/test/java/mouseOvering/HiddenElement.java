package mouseOvering;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddenElement {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Men = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(Men).perform();
		
		WebElement Jackets = driver.findElement(By.xpath("//a[text()='Jackets']"));
		
		Jackets.click();
		
		
		
	}

}
