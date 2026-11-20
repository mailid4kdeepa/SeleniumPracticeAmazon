package learningJava;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemofindLocator {
	public static void main(String[] args) {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize
		driver.manage().window().minimize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//naviagte to appln
		driver.get("https://demowebshop.tricentis.com/login");
		
		//printing particular login text
		String logincontect = driver.findElement(By.className("form-fields")).getText();
		System.out.println(logincontect);
		
		
		driver.get("https://demoqa.com/text-box");
		
		//get attribute
		@Nullable
		String fullname = driver.findElement(By.id("userName")).getAttribute("placeholder");
		System.out.println(fullname);
		
		String fullname1 = driver.findElement(By.id("userName")).getAttribute("id");
		System.out.println(fullname1);
		driver.quit();
	}

}
