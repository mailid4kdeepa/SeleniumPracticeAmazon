package learningJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingBoostStrapDropDown {
	public static void main(String[] args) {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to appln
		driver.get("https://demoqa.com/select-menu");
		
		//Select boost trap dd and store it
		  WebElement dropdown = driver.findElement(By.id("react-select-4-placeholder"));
		 JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].scrollIntoView(true);", dropdown);

			js.executeScript("arguments[0].click();", dropdown);

			driver.findElement(By.xpath("//div[text()='Blue']")).click();
		//driver.findElement(By.xpath("//svg[contains(@class,'css-8mmkcg')]/..")).click();
		
	}

}
