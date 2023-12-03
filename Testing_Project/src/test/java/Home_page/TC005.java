package Home_page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilityClass.Utility_Method;

public class TC005 {
    
    @Test
    public void loginDiffBrowser() throws InterruptedException, IOException {
    	 WebDriver driver = Utility_Method.openBrowserF();
    	 Thread.sleep(3000);
    	 driver.findElement(By.xpath("//span[@role ='button']")).click();
    	 Thread.sleep(3000);
    	 //driver.findElement(By.xpath("(//span)[1]")).click();
    	 driver.findElement(By.xpath("//img[@class=\"-dOa_b L_FVxe\"]")).click();
    	 driver.findElement(By.xpath("(//input[@type = 'text'])[2]")).sendKeys("8307746282");
    	 driver.findElement(By.xpath("(//button)[2]")).click();
    	 Thread.sleep(100000);
    	 driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]")).click();
    	 Thread.sleep(2000);
    	 driver.close();
    	
    }
}



