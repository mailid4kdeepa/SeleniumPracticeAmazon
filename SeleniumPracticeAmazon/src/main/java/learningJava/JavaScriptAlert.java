package learningJava;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//imlicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to appln
		driver.get("https://demowebshop.tricentis.com/");
		
		//identify and search button and click button
		driver.findElement(By.cssSelector("[value='Search']")).click();
		Alert alert=driver.switchTo().alert();
		
		String text=alert.getText();
		System.out.println("The text of alert is:"+text);
		Thread.sleep(3000);
		alert.accept();
		
		
		
	}

}
