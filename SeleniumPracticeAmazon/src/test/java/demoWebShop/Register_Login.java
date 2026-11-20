package demoWebShop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register_Login {
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver();

		//maximize
		driver.manage().window().maximize();

		//implicit waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//naviagtion to appln
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Deepa");
		driver.findElement(By.id("LastName")).sendKeys("Karthik");

		String email="deepa"+System.currentTimeMillis()+"@test.com";
		driver.findElement(By.id("Email")).sendKeys(email);

		driver.findElement(By.id("Password")).sendKeys("sk@245265",Keys.TAB);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("sk@245265");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.cssSelector("[value='Continue']")).click();
		Thread.sleep(3000);

		//after registration
		String acctext = driver.findElement(By.className("account")).getText();

		//validation
		if(acctext.equalsIgnoreCase(email))
		{
			System.out.println("user is logged in after registration");
		}
		else
		{
			System.out.println("user is not logged in");
		}
		//to click jewelry option
		WebElement text = driver.findElement(By.xpath("(//a[normalize-space()='Jewelry'])[3]"));
		text.click();
		
		Thread.sleep(2000);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

		WebElement addtocart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@value='Add to cart'])[2]")));
		
		addtocart.click();
		
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		WebElement qty = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		qty.clear();
		qty.sendKeys("2");
		
		driver.findElement(By.id("termsofservice")).click();
		
		driver.findElement(By.id("checkout")).click();
		WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"));
		country.click();
		Select s=new Select(country);
		Thread.sleep(4000);
		s.selectByValue("41");
		driver.findElement(By.linkText("Log out")).click();
		
		//driver.quit();

	}

}
