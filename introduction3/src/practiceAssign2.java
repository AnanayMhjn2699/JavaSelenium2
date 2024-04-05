import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practiceAssign2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Ananay Mahajan");
		driver.findElement(By.name("email")).sendKeys("ananay@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
		driver.findElement(By.id("exampleCheck1")).click();
		
		//exampleFormControlSelect1
		WebElement drop=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown=new Select(drop);
		dropdown.selectByIndex(0);
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.name("bday")).sendKeys("1/1/2000");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div[class*='alert']")).getText());
		
		driver.close();

	}

}
