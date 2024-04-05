import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class assign6_doNotUseHardCodedvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		String text = driver.findElement(By.cssSelector("input[type='checkbox']")).getAttribute("value");
		
		//System.out.println(text);
		
		WebElement staticDrop=driver.findElement(By.id("dropdown-class-example")) ;
		Select dropdown =new Select(staticDrop);
		dropdown.selectByValue(text);
		
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		
		String text2=driver.switchTo().alert().getText().split(",")[0].split(" ")[1];
		//System.out.println(text2);
		
		Assert.assertEquals(text, text2);
		
		
		
		
		
		
		
		
	}
	

}
