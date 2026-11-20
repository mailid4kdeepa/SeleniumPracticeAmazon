package learningJava;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSciptAlert2 {
	public static void main(String[] args) {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to appln
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		
		Alert alert=driver.switchTo().alert();
		
		String text=alert.getText();
		System.out.println("The text of alert is:"+text);
		alert.accept();
		
	}

}
