package Home_page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseTest.Base_Test;
import utilityClass.Utility_Method;

public class TC009 extends Base_Test {

	@Test
	public void Redirect_to_profile() throws InterruptedException, IOException {
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role ='button']")).click();
		driver.findElement(By.xpath("(//span)[1]")).click();
		driver.findElement(By.xpath("(//input[@type = 'text'])[2]")).sendKeys("8307746282");
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(200000);
		driver.findElement(By.xpath("(//div[@class=\"H6-NpN\"])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//li[@class=\"AT0fUR\"]")).click();

		Thread.sleep(2000);
		
	}
}
