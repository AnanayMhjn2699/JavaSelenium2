import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] itemsToAdd= {"Apple","Cucumber","Raspberry"};
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		
		List<WebElement> items = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		List listOfItemsToAdd = Arrays.asList(itemsToAdd); 
		
		int j=0;
		for(int i=0;i<items.size();i++) {
			String item= items.get(i).getText().split("-")[0].trim();
			
			if(listOfItemsToAdd.contains(item)) {
				j++;
				driver.findElements(By.xpath("(//div[@class='product-action']/button)")).get(i).click();
				
				if(j == itemsToAdd.length)
						break;
			}
		}
	
		
		//driver.close();
		
		
		
		

	}

}
