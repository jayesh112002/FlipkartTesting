package Home_page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.Base_Test;

public class TC002 extends Base_Test {

	@Test
	public void loginName() throws InterruptedException, IOException {
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role ='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span)[1]")).click();
		driver.findElement(By.xpath("(//input[@type = 'text'])[2]")).sendKeys("8307746282");
		Thread.sleep(150000);

		WebElement ele = null;
		try {
			ele = driver.findElement(By.xpath("//header"));
			if (ele.isDisplayed()) {
				System.out.println("TC002--Username is Visible");
			} else {
				System.out.println("TC002--Username Not Visible");
				takeScreenshot();
			}
		} catch (NoSuchElementException e) {
			System.out.println("TC002--Element not found: " + e.getMessage());
			takeScreenshot();
		}
	}

}
