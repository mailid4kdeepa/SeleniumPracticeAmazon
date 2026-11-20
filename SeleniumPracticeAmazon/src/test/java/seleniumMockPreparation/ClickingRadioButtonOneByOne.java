package seleniumMockPreparation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingRadioButtonOneByOne {
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//implicitwaits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to appln
		/*driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		  List<WebElement> rbutton = driver.findElements(By.name("pollanswers-1"));

		for(WebElement ele:rbutton)
		{
			ele.click();
			Thread.sleep(2000);
		}*/
		
		driver.get("https://www.amazon.com/events/bigspringsale?ref_=nav_cs_gb");
		WebElement radio = driver.findElement(By.xpath("(//i[contains(@class,'a-icon')])[7]"));
		radio.click();
			
		
		
		driver.quit();
	}

}
