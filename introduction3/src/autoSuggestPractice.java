import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("in");
		Thread.sleep(2000);
		
		List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		
		for(WebElement opt:options) {
			if(opt.getText().equalsIgnoreCase("INdia")) {
				opt.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		driver.close();
		

		
	}

}
