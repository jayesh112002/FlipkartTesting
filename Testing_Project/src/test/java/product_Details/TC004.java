package product_Details;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.Base_Test;

public class TC004 extends Base_Test{
	 @Test
	    public void testProductSpecificationDisplayed() throws InterruptedException {
		 driver.manage().window().maximize();

	        driver.findElement(By.xpath("//span[@role ='button']")).click();
	        WebElement searchBox = driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]"));
	        assertTrue(searchBox.isDisplayed());
	        driver.findElement(By.xpath("(//span)[6]/../..")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("(//div[@class=\"CXW8mj\"])[1]")).click();
	        Thread.sleep(3000);
	   
	        Set<String> windowHandles = driver.getWindowHandles();

	        for (String handle : windowHandles) {
	            
	            driver.switchTo().window(handle);
	        }
	        List<WebElement> ProductSpecification = driver.findElements(By.xpath("//li[@class=\"_21Ahn-\"]"));
	        for(WebElement ele : ProductSpecification) {
	        System.out.println("TC004--"+ele.getText());
	        assertTrue(ele.isDisplayed());
	        }
	    }
}
