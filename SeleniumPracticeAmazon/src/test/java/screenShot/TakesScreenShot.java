	package screenShot;
	
	import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;
	
	public class TakesScreenShot {
		public static void main(String[] args) throws IOException, InterruptedException {
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.com/");
			Thread.sleep(2000);
			
			/*TakesScreenshot tks=(TakesScreenshot)driver;
			File src = tks.getScreenshotAs(OutputType.FILE);
			File dest =new File("./snap/amazon.png");
			FileHandler.copy(src, dest);*/
			
			WebElement ele = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
			
			   File src=ele.getScreenshotAs(OutputType.FILE);
			   File dest=new File("./snap/amazonlogo.png");
			   FileHandler.copy(src, dest);
			
			driver.close();
		}
	
	}
