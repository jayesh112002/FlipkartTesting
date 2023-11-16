package Home_page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilityClass.Utility_Method;

public class TC009 {
	
	@Test
	 public void Redirect_to_profile() throws InterruptedException, IOException {
    	 WebDriver driver = Utility_Method.openBrowserC();
    	 driver.findElement(By.xpath("//span[@role ='button']")).click();
    	 driver.findElement(By.xpath("//span[@class=\"_1sLnDu\"]")).click();
    	 driver.findElement(By.xpath("(//input[@type = 'text'])[2]")).sendKeys("8307746282");
    	 //driver.findElement(By.xpath("(//button)[2]")).click();
    	 Thread.sleep(200000);
    	 driver.findElement(By.xpath("(//div[@class=\"H6-NpN\"])[1]")).click();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    	 driver.findElement(By.xpath("//li[@class=\"AT0fUR\"]")).click();
    	 
    	 Thread.sleep(2000);
    	 Utility_Method.captureScreenshot(driver,"./Screenshot/HP_TC009Redirect_to_ProfileSS.png");
    }
}
