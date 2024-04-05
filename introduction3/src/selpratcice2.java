import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class selpratcice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'forgot')]/button[2]")).click();
		
		String password=getPassword(driver);
		
		driver.findElement(By.xpath("//div[contains(@class,'forgot')]/button[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("inputUsername")).sendKeys("Ananay");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		
		driver.findElement(By.cssSelector("div[class*='check'] span:first-child input")).click();
		
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class*='container'] h2")).getText(),"Hello Ananay,");
		
		Thread.sleep(2000);
		driver.findElement(By.className("logout-btn")).click();
		
		driver.close();


	}

public static String getPassword(WebDriver driver) throws InterruptedException {
		
		String data=driver.findElement(By.className("infoMsg")).getText();
		String password= data.split("'")[1].split("'")[0];
		
		return password;
	}
}
