package amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {
	public static void main(String[] args) {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to appln
		driver.get("https://www.amazon.in/");
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("mobile");
		//searchbox.submit();  //or
		driver.findElement(By.id("nav-search-submit-button")).submit();
		
		//identify mobile and store it
		driver.findElement(By.xpath("(//h2/span)[7]")).click();
		
		  Select s=new Select(driver.findElement(By.cssSelector("#a-autoid-6-announce")));
		  s.selectByVisibleText("Quantity:");
		
	}

}
