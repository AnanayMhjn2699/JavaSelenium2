import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpagePractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");

		driver.findElement(By.cssSelector("input[value*='user']")).click();
		
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("okayBtn"))));
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement staticDrop=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropDown=new Select(staticDrop);
		dropDown.selectByValue("consult");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
			
		//Thread.sleep(3000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='row']")));
		//w.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div[class='row']"))));
			List<WebElement> items	= driver.findElements(By.cssSelector("button[class*='btn']"));
			for(WebElement i:items) {
				i.click();
			}
			
			
		//w.until(ExpectedConditions.fram)
	}

}
