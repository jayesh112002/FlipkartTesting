package Home_page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilityClass.Utility_Method;

public class TC004 {
    
    @Test
    public void SearchBox() throws InterruptedException, IOException {
    	 WebDriver driver = Utility_Method.openBrowserC();
    	 driver.findElement(By.xpath("//span[@role ='button']")).click();
    	 //driver.findElement(By.xpath("//span[@class=\"_1sLnDu\"]")).click();
    	 //driver.findElement(By.xpath("(//input[@type = 'text'])[2]")).sendKeys("8307746282");
    	 //driver.findElement(By.xpath("(//button)[2]")).click();
    	 //Thread.sleep(100000);
    	 driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]")).sendKeys("mobile");
    	 Thread.sleep(2000);
    	 Utility_Method.captureScreenshot(driver,"./Screenshot/HP_TC004SearchBoxSS.png");
    }
}

