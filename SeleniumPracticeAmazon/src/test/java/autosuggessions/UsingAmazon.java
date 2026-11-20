package autosuggessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingAmazon {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.amazon.com/");
	
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("appliance");
	List<WebElement> autosuggs = driver.findElements(By.cssSelector("[aria-label='appliance dolly']"));
	
	for(WebElement ele:autosuggs)
	{
		System.out.println(ele.getText());
		if(ele.getText().contains("appliance dolly"))
		{
			ele.click();
			break;
		}
	}
	driver.close();
	
}
}
