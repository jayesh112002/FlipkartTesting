package Home_page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.Base_Test;
import utilityClass.Utility_Method;

public class TC007 extends Base_Test {

	@Test
	public void Redirect_to_product() throws InterruptedException, IOException {

		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role ='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@alt=\"Image\"])[22]")).click();
		Thread.sleep(10000);
		Utility_Method.captureScreenshot(driver, "./Screenshot/HP_TC007Redirect_to_ProductSS.png");
	}
}
