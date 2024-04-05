import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uploadDownloadTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		
		driver.manage().window().maximize();
		
		//download
		driver.findElement(By.id("downloadButton")).click();
		
		
		//upload //the first time you run this script will give error that file not found bcoz the file
		//to upload does not exists yet. 
		driver.findElement(By.id("fileinput")).sendKeys("C:\\Users\\ananmaha\\Downloads\\download.xlsx");
		
		//check toast appears
		By findBy=By.cssSelector(".Toastify__toast-body div:nth-child(2)");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
		System.out.println( driver.findElement(findBy).getText());

		//check toast has disappeared
		wait.until(ExpectedConditions.invisibilityOfElementLocated(findBy));
	}

}
