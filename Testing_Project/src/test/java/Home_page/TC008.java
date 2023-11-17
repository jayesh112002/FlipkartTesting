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

import baseTest.Base_Test;
import utilityClass.Utility_Method;

public class TC008 extends Base_Test {

	@Test
	public void Redirect_to_category() throws InterruptedException, IOException {

		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role ='button']")).click();
		driver.findElement(By.xpath("//img[@alt=\"Mobiles\"]")).click();
		Thread.sleep(5000);

		Utility_Method.captureScreenshot(driver, "./Screenshot/HP_TC008Redirect_CategorySS.png");
	}
}
