package Home_page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilityClass.Utility_Method;
import baseTest.Base_Test;

public class TC001 extends Base_Test {
    
    @Test
    public void login() throws InterruptedException, IOException {
    	 
    	 driver.get("https://www.flipkart.com");
   	     driver.manage().window().maximize();
    	 driver.findElement(By.xpath("//span[@role ='button']")).click();
    	 driver.findElement(By.xpath("(//span)[1]")).click();
    	 driver.findElement(By.xpath("(//input[@type = 'text'])[2]")).sendKeys("8307746282");
    	 driver.findElement(By.xpath("(//button)[2]")).click();
    	 Thread.sleep(200000);
    	 Utility_Method.captureScreenshot(driver, "./Screenshot/loginSS.png");
    }
}
