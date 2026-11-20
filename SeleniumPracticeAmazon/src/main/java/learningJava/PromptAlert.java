package learningJava;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to appln
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(4000);
		
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Deepa");
		
		Thread.sleep(2000);
		String text=alert.getText();
		System.out.println("The text of prompt alert is:"+text);
		alert.accept();
		driver.quit();
		
	}

}
