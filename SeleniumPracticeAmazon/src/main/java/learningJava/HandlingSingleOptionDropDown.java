package learningJava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleOptionDropDown {
public static void main(String[] args) {
	//launch the browser
	WebDriver driver=new ChromeDriver();
	
	//maximize
	driver.manage().window().maximize();
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//navigate to appln
	driver.get("https://the-internet.herokuapp.com/dropdown");
	
	//selecting single option identify the dd and store it..
	WebElement selectoption = driver.findElement(By.id("dropdown"));
	Select options=new Select(selectoption);
	options.selectByIndex(1);
	WebElement options1 = options.getFirstSelectedOption();
	System.out.println(options1.getText());
	boolean moreoptions=options.isMultiple();
	System.out.println(moreoptions);
	
	
	
	
	
	
	
	
}
}
