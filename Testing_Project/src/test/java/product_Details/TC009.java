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

public class TC009 extends Base_Test {
	@Test
	public void testPaymentOptionsDisplayed() throws InterruptedException {
		
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

		WebElement PaymentOptions = driver.findElement(By.xpath("//div[@class=\"_3vDXYV flex\"]"));
		System.out.println("TC009--" + PaymentOptions.getText());
		assertTrue(PaymentOptions.isDisplayed());
		
	}
}
