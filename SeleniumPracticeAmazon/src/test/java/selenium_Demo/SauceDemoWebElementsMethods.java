package selenium_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoWebElementsMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		
		WebElement un = driver.findElement(By.id("user-name"));
		
		System.out.println("UsernameText="+un.getText());
		System.out.println("Tagname ="+un.getTagName());
		System.out.println("CssValue="+un.getCssValue("font"));
		
		driver.close();
	}

}
