package selenium_Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		/*WebElement search = driver.findElement(By.id("small-searchterms"));
		System.out.println(search.getDomAttribute("value"));
		System.out.println(search.getDomProperty("value"));
		System.out.println(search.getAttribute("value"));
		System.out.println(search.getAriaRole());
		System.out.println(search.getAccessibleName());
		System.out.println(search.getLocation());
		
		System.out.println(search.getSize());
		System.out.println(search.getLocation());
		System.out.println(search.getRect());*/
		
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		
		//to iterate each element go for for each loop
		for(WebElement list:buttons)
		{
			System.out.println(list.getText());
		}
		
		driver.close();
	}

}
