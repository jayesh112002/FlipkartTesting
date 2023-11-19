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

public class TC007 extends Base_Test {

	@Test
	public void searchInDifferentCategories() {

		driver.manage().window().maximize();

		String[] categories = { "Movies", "Books", "Grocery", "Electronics" };

		for (String category : categories) {

			performSearch(category);

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			By resultsLocator = By.xpath("//div[@data-id]");
			wait.until(ExpectedConditions.visibilityOfElementLocated(resultsLocator));

			String resultsText = driver.findElement(By.xpath("//span[contains(text(), 'results for')]")).getText();
			Assert.assertTrue(resultsText.contains(category), "Search results do not match the category: " + category);

			driver.navigate().back();
		}
	}

	private void performSearch(String searchQuery) {
		WebElement searchField = driver
				.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));

		searchField.clear();

		searchField.sendKeys(searchQuery);

		searchField.sendKeys(Keys.ENTER);
	}
}
