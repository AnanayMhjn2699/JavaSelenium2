import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkboxPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();
	Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("checkBoxOption1")).click();
	Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
	
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	
		driver.close();
		
		

	}

}
