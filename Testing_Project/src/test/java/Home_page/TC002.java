package Home_page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilityClass.Utility_Method;

public class TC002 {
    //Utility_Method obj = new Utility_Method();
    
    @Test
    public void loginName() throws InterruptedException, IOException {
    	 WebDriver driver = Utility_Method.openBrowserC();
    	 driver.findElement(By.xpath("//span[@role ='button']")).click();
    	 driver.findElement(By.xpath("//span[@class=\"_1sLnDu\"]")).click();
    	 driver.findElement(By.xpath("(//input[@type = 'text'])[2]")).sendKeys("8307746282");
    	 Thread.sleep(150000);
    	 WebElement ele = driver.findElement(By.xpath("//header"));
    	 Utility_Method.captureElementScreenshot(driver,ele ,"./Screenshot/HP_TC002loginNameSS.png");
    }
}

