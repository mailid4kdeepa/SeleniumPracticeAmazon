package learningJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingiframes {
	public static void main(String[] args) {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		//navigate to appln
		driver.get("https://demoqa.com/frames");
		
		WebElement firstframe = driver.findElement(By.id("frame1"));
		
		driver.switchTo().frame(firstframe);
		
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		
		
		driver.switchTo().defaultContent();
		//WebElement frametwo = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(0);//either we can put id or name or have to go for webelement
		String text1 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text1);
		
		driver.switchTo().defaultContent();
		
		driver.quit();
		
	
		
	
		
		
	}

}
