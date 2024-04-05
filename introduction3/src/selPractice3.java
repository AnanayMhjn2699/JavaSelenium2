import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selPractice3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//ctl00_mainContent_ddl_originStation1_CTXT id of button
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("a[value='ATQ']")).click();
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
//		Thread.sleep(2000);
		
		//if we do not want to use indices then we can use parent child xpath
		//when there are no immediate parent to the child
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
	
	}

}
