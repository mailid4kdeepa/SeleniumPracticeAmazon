package seleniumMockPreparation;

import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	public static void main(String[] args) {
		//launch the browser
		WebDriver driver =new ChromeDriver();
		
		//maximize
	driver.manage().window().maximize();
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//navigate to appln
	driver.get("https://www.amazon.com/");
	
	WebElement link = driver.findElement(By.xpath("//span[.='& Orders']"));
	
	System.out.println(link.getText());
	System.out.println(link.getTagName());
	
	//To fetch size of the element only have to go for get.size() not getcssvalue
	System.out.println(link.getSize());
	Dimension d = link.getSize();
	System.out.println(d.getHeight());
	
	
	//getcssvalue(); color,margin,background-colour,font-size
	System.out.println(link.getCssValue("background-color"));
	System.out.println(link.getCssValue("margin"));
	System.out.println(link.getCssValue("font-size"));
	System.out.println(link.getCssValue("color"));
	
	//getDomAttribute
	System.out.println(link.getDomAttribute("class"));
	
	WebElement stf = driver.findElement(By.id("twotabsearchtextbox"));
	System.out.println(stf.getAriaRole());
	System.out.println(stf.getAccessibleName());
	System.out.println("The area role is"+link.getAriaRole());
	
	//getLocation()
	System.out.println(stf.getLocation().getX());
	System.out.println(stf.getLocation().getY());
	
	//getRect() we will get both location and size
	Rectangle sizelocation = stf.getRect();
	System.out.println(sizelocation.getHeight());
	System.out.println(sizelocation.getWidth());
	System.out.println(sizelocation.getX());
	System.out.println(sizelocation.getY());
	
	//identify getDomAttribute
	@Nullable
	String idvalue = driver.findElement(By.cssSelector("[type='text']")).getDomAttribute("id");
	System.out.println(idvalue);
	
	//getAttribute
	System.out.println(link.getAttribute("class"));
	
 List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(WebElement link1:links)
	{
		System.out.println(link1.getText());
	}
	
	
	
	
	driver.quit();
	}

}
