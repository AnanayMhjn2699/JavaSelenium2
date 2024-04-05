import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class assign8_autocompleteMouseClicks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.id("ui-id-3"))).click().build().perform(); 
		
		String text = driver.findElement(By.id("autocomplete")).getAttribute("value");
		Assert.assertEquals(text, "India");
		
		
		

	}

}
