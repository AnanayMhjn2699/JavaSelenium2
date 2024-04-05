import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class selpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
	
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Ananay");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("anany@gmail.com");
		driver.findElement(By.cssSelector("form input:nth-child(4)")).sendKeys("7626388989");
		
		driver.findElement(By.xpath("//div[contains(@class,'forgot')]/button[2]")).click();
		
			
		driver.findElement(By.xpath("//div[contains(@class,'forgot')]/button[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("inputUsername")).sendKeys("Ananay");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("div[class*='check'] span:first-child input")).click();
		
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.className("logout-btn")).click();
		
		driver.close();
	}
	
	

}
