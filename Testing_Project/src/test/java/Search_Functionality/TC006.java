package Search_Functionality;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.Base_Test;

public class TC006 extends Base_Test {
		
	private int expectedResultsPerPage = 24; // Set the expected number of results per page

    @Test
    public void searchWithResultPerPage() {
    
    	 driver.manage().window().maximize();
         driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
         WebElement searchField = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));

         // Type a search query
         String searchQuery = "laptop";
         searchField.sendKeys(searchQuery);

         // Press Enter key to perform the search
         searchField.sendKeys(Keys.ENTER);
         
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         
         wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//span[normalize-space()='Filters']"))));

        // Verify the number of displayed results on the page
        int actualResultsPerPage = driver.findElements(By.xpath("//div[@data-id]")).size();
        Assert.assertEquals(actualResultsPerPage, expectedResultsPerPage, "Number of results per page does not match");
    }
}
