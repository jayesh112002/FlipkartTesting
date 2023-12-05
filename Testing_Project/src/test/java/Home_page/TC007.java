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

		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role ='button']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//img[@alt=\"Image\"])[20]"));
		WebElement ele2 = driver.findElement(By.xpath("(//img[@alt=\"Image\"])[20]/../..//div[@class=\"_58bkzq62 _3n8fnaug _3n8fnamv _3n8fnaf9 _3n8fna1 _3n8fna7n _58bkzq2 _1i2djtb9 _1i2djt0\"]"));
		String text = ele2.getText();
		System.out.println("TC007--"+text);
		ele.click();
		Thread.sleep(10000);
	}
}
