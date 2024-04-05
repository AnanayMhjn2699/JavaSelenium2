import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentChildWindowTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.cssSelector(".example a")).click();
		
		Set<String> windows = driver.getWindowHandles(); 
		Iterator<String> i=windows.iterator();
		
		String parentId = i.next();
		String childId = i.next();
		
		driver.switchTo().window(childId);
		System.out.println( driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		
		driver.switchTo().window(parentId);
		System.out.println( driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		

	}

}
