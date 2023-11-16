package Home_page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utilityClass.Utility_Method;

public class TC008 {

	@Test
	public void Redirect_to_category() throws InterruptedException, IOException {
		WebDriver driver = Utility_Method.openBrowserC();
		driver.findElement(By.xpath("//span[@role ='button']")).click();
//		 driver.findElement(By.xpath("//span[@class=\"_1sLnDu\"]")).click();
//		 driver.findElement(By.xpath("(//input[@type ='text'])[2]")).sendKeys("8307746282"); 
//		 driver.findElement(By.xpath("(//button)[2]")).click();
//		 Thread.sleep(150000);
		
//		WebElement ele = driver.findElement(By.xpath("(//a[@class= '_1TOQfO'])[1]"));
//		Actions action = new Actions(driver);
//		action.moveToElement(ele);
//		Thread.sleep(5000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//img[@alt=\"Mobiles\"]")).click();
		Thread.sleep(5000);
		
		
		Utility_Method.captureScreenshot(driver, "./Screenshot/HP_TC008Redirect_CategorySS.png");
	}
}
