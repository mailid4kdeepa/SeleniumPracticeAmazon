package learningJava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultioptionDropDown {
	public static void main(String[] args) {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigater to appln
		driver.get("https://demoqa.com/select-menu");
		
		//Selecting multiple options
		WebElement cars = driver.findElement(By.id("cars"));
		Select multicars=new Select(cars);
		
		multicars.selectByValue("volvo");
		multicars.selectByContainsVisibleText("Opel");
		multicars.selectByIndex(1);
		List<WebElement> allcars = multicars.getAllSelectedOptions();
		for(WebElement ele:allcars)
		{
			System.out.println(ele.getText());
		}
		
		boolean allcars1=multicars.isMultiple();
		System.out.println(allcars1);
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		
		}

}
