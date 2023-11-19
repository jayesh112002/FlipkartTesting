package Home_page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.Base_Test;
import utilityClass.Utility_Method;

public class TC006 extends Base_Test {

	@Test
	public void Proper_Allign() throws InterruptedException, IOException {

		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role ='button']")).click();
		WebElement ele = driver.findElement(By.xpath("//div[@class=\"_3sdu8W emupdz\"]"));
		Thread.sleep(2000);
		
	}
}
