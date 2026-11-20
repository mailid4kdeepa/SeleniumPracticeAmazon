package seleniumMockPreparation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintingMobilePrice {
public static void main(String[] args) throws InterruptedException {
	//launch the browser
	WebDriver driver =new ChromeDriver();
	
	//maximize
	driver.manage().window().maximize();
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	/*driver.get("https://www.flipkart.com/");
	
	/* WebElement oneplus = driver.findElement(By.cssSelector("[type='text']"));
	 oneplus.sendKeys("one plus phone",Keys.ENTER);
	 WebElement price = driver.findElement(By.xpath("(//div[contains(@class,'hZ3P6w')])[1]"));
	 System.out.println(price.getText());*/
	
	driver.get("https://www.bigbasket.com/");
	
	WebElement search = driver.findElement(By.xpath("//input[contains(@placeholder,'Search for')]"));
	search.sendKeys("apples",Keys.ENTER);
	Thread.sleep(4000);
	// Locate correct Add button
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Add'])[1]")));
	Actions act=new Actions(driver);
	act.moveToElement(addToCart).perform();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", addToCart);
	
}
}
