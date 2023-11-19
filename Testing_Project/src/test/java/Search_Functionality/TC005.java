package Search_Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.Base_Test;

public class TC005 extends Base_Test {

	@Test
	public void searchWithSortingOptions() {

		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
		WebElement searchField = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));

		// Type a search query
		String searchQuery = "laptop";
		searchField.sendKeys(searchQuery);

		// Press Enter key to perform the search
		searchField.sendKeys(Keys.ENTER);
		
		WebElement sortoption = driver.findElement(By.xpath("//span[@class='_2i7N3j']"));
		Assert.assertTrue(sortoption.getText().contains("Sort"), "Search results do not match the search query");
	}
}
