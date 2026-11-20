package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoqa.com/alerts");
	
	driver.findElement(By.id("promtButton")).click();
	
	Alert alt = driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.sendKeys("Babitha");
	alt.accept();
}
}
