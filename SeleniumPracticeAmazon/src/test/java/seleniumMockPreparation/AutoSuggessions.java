package seleniumMockPreparation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggessions {
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver();

		//maximize
		driver.manage().window().maximize();

		//implicit waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//naviagte to appln
		/*driver.get("https://www.amazon.com/");
		
		Thread.sleep(3000);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dress");
		Thread.sleep(3000);

		List<WebElement> autosugg = driver.findElements(By.xpath("//div[@aria-label='dresses for women']"));
		for(WebElement ele:autosugg)
		{
			System.out.println(ele.getText());
			if(ele.getText().contains("dresses for women"))
			{
				ele.click();
				Thread.sleep(2000);
				break;
				
			}*/
			
			
			driver.get("https://www.myntra.com/womens-western-wear");
			
			WebElement wishlist = driver.findElement(By.xpath("//span[.='wishlist']"));
			
			wishlist.click();

			
			driver.quit();
			//driver.quit();
		}

	}


