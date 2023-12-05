package product_Details;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.Base_Test;

public class TC002 extends Base_Test{
	 @Test
	    public void testProductPriceDisplayed() throws InterruptedException {
		 driver.manage().window().maximize();

	        driver.findElement(By.xpath("//span[@role ='button']")).click();
	        driver.findElement(By.xpath("(//img[@alt='Image'])[20]")).click();
	        Thread.sleep(3000);
	        WebElement priceElement = driver.findElement(By.xpath("(//div[@class=\"_30jeq3\"])[1]"));
	        System.out.println("TC002--"+priceElement.getText());
	        assertTrue(priceElement.isDisplayed());
	    }
}
