package Home_page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilityClass.Utility_Method;
import baseTest.Base_Test;


public class TC002 extends Base_Test {
    
    
    @Test
    public void loginName() throws InterruptedException, IOException {
    	 
    	 driver.get("https://www.flipkart.com");
    	 driver.manage().window().maximize();
    	 driver.findElement(By.xpath("//span[@role ='button']")).click();
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("(//span)[1]")).click();
    	 driver.findElement(By.xpath("(//input[@type = 'text'])[2]")).sendKeys("8307746282");
    	 Thread.sleep(150000);
    	 WebElement ele = driver.findElement(By.xpath("//header"));
    	 Utility_Method.captureElementScreenshot(driver,ele ,"./Screenshot/HP_TC002loginNameSSS.png");
    }
}

