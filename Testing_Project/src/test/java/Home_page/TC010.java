package Home_page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.Base_Test;
import utilityClass.Utility_Method;

public class TC010 extends Base_Test {

	@Test
	public void Product_are_categorised() throws InterruptedException, IOException {
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role ='button']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//div[contains(text(), 'Best of Electronics')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", ele);

		Thread.sleep(2000);
		Utility_Method.captureScreenshot(driver, "./Screenshot/HP_TC010Hover_to_categorySS.png");
	}
}
