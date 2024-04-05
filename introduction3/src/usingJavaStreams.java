import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingJavaStreams {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int sum=0;
		List<WebElement> itemList = driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr/td[3]"));
		System.out.println(itemList.stream().map(i->sum+Integer.parseInt(i.getText()) )); 

	}

}
