package product_Details;

import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.Base_Test;

public class TC003 extends Base_Test{
	 @Test
	    public void testProductReviewDisplayed() throws InterruptedException {
		 driver.manage().window().maximize();

	        driver.findElement(By.xpath("//span[@role ='button']")).click();
	        driver.findElement(By.xpath("(//span)[6]/../..")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("(//div[@class=\"CXW8mj\"])[1]")).click();
	        Thread.sleep(3000);
	   
	        Set<String> windowHandles = driver.getWindowHandles();

	        for (String handle : windowHandles) {
	            
	            driver.switchTo().window(handle);
	        }
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebElement ReviewElement = driver.findElement(By.xpath("//div[text()='Ratings & Reviews']"));
	        js.executeScript("arguments[0].scrollIntoView(true)",ReviewElement);
	        System.out.println("TC003--"+ReviewElement.getText());
	        assertTrue(ReviewElement.isDisplayed());
	    }
}
