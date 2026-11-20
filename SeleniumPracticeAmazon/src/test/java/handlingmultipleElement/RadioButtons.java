package handlingmultipleElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	
	Thread.sleep(2000);
	
	List<WebElement> radiobtns = driver.findElements(By.cssSelector("[type='radio']"));
	
	
	for(WebElement rbtn:radiobtns)
	{
	rbtn.click();
	}
	
	driver.close();
}


}
