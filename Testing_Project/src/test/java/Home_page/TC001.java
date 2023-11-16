package Home_page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilityClass.Utility_Method;

public class TC001 {
    
    @Test
    public void login() throws InterruptedException, IOException {
    	 WebDriver driver = Utility_Method.openBrowserC();
    	 driver.findElement(By.xpath("//span[@role ='button']")).click();
    	 driver.findElement(By.xpath("//span[@class=\"_1sLnDu\"]")).click();
    	 driver.findElement(By.xpath("(//input[@type = 'text'])[2]")).sendKeys("8307746282");
    	 //driver.findElement(By.xpath("(//button)[2]")).click();
    	 Thread.sleep(150000);
    	 Utility_Method.captureScreenshot(driver, "./Screenshot/loginSS.png");
    }
}
