package product_Details;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.Base_Test;

public class TC007 extends Base_Test{
	 @Test
	    public void testProductVariationDisplayed() throws InterruptedException {
		 driver.manage().window().maximize();

	        driver.findElement(By.xpath("//span[@role ='button']")).click();
	        WebElement searchBox = driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]"));
	        assertTrue(searchBox.isDisplayed());
	        driver.findElement(By.xpath("(//span)[6]/../..")).click();
	        Thread.sleep(3000);
	        
	        List<WebElement> ProductVariation = driver.findElements(By.xpath("//a[@class=\"s1Q9rs\"]"));
	        for(WebElement ele : ProductVariation) {
	        System.out.println("TC007--"+ele.getText());
	        assertTrue(ele.isDisplayed());
	        }
	    }
}
