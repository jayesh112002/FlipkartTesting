package product_Details;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseTest.Base_Test;
import utilityClass.Utility_Method;

public class TC008 extends Base_Test {
	@Test
	public void testDeliveryInfoDisplayed() throws InterruptedException {
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[@role ='button']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class=\"YBLJE4\"])[2]")).click();
		
		driver.findElement(By.xpath("(//div[@class=\"CXW8mj\"])[1]")).click();
		Thread.sleep(3000);

		Set<String> windowHandles = driver.getWindowHandles();

		for (String handle : windowHandles) {
			driver.switchTo().window(handle);
		}

		WebElement DeliveryInfo = driver.findElement(By.xpath("(//div[@class=\"col col-12-12\"])[1]"));
		System.out.println("TC008--" + DeliveryInfo.getText());
		assertTrue(DeliveryInfo.isDisplayed());
		
	}
}
