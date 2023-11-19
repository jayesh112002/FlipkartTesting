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

public class TC004 extends Base_Test {

	@Test
	public void searchBasedOnCriteria() {
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		// Test searching based on product name
		performSearch("Laptop");

		// Test searching based on brand name
		performSearch("Samsung");

		// Test searching based on product specification
		performSearch("4K Ultra HD TV");

		// You can add more test cases for different search criteria
	}

	private void performSearch(String searchQuery) {
		WebElement searchField = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));

		// Clear the search field
		searchField.clear();

		// Type the search query
		searchField.sendKeys(searchQuery);

		// Press Enter key to perform the search
		searchField.sendKeys(Keys.ENTER);

		// Wait for the search results to load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait for a specific element on the search results page to be visible
		By resultsLocator = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div");
		wait.until(ExpectedConditions.visibilityOfElementLocated(resultsLocator));

		// Verify that the search results contain the expected text
		String resultsText = driver.findElement(By.xpath("//span[contains(text(), 'results for')]")).getText();
		Assert.assertTrue(resultsText.contains(searchQuery),
				"Search results do not match the search query: " + searchQuery);
		driver.navigate().to("https://www.flipkart.com");
	}
		
}
