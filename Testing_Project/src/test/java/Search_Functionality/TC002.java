package Search_Functionality;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseTest.Base_Test;
import utilityClass.ReadXLSdata;

@Listeners(utilityClass.ListenerClass.class)
public class TC002 extends Base_Test{

	@Test(dataProviderClass=ReadXLSdata.class, dataProvider="searchdata")
    public void searchAndVerifyResults(String searchQuery) {
        
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
        WebElement searchField = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));

        // Type a search query
       
        searchField.sendKeys(searchQuery);

        // Press Enter key to perform the search
        searchField.sendKeys(Keys.ENTER);

        // Wait for the search results page to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//span[normalize-space()='Filters']"))));
        
        // Verify that the search results contain the expected text
        String resultsText = driver.findElement(By.xpath("//span[contains(text(), 'results for')]")).getText();
        Assert.assertTrue(resultsText.contains(searchQuery), "Search results do not match the search query");
	}
}
