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

public class TC003 extends Base_Test {

	@Test
	public void searchApplyFilterAndVerifyResults() throws InterruptedException {

		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
		WebElement searchField = driver
				.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));

		// Type a search query
		String searchQuery = "phone";
		searchField.sendKeys(searchQuery);

		// Press Enter key to perform the search
		searchField.sendKeys(Keys.ENTER);

		// Wait for the search results page to load

		WebElement firstcheckbox = driver.findElement(By.xpath("//div[@class='_24_Dny']"));
		firstcheckbox.click();
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions
				.visibilityOfElementLocated((By.xpath("//div[@class='_4rR01T']"))));

		String resultsText = driver.findElement(By.xpath("//div[@class='_4rR01T']"))
				.getText();
		
		
		Assert.assertTrue(resultsText.contains(driver.findElement(By.xpath("//div[@class='_3879cV']")).getText()), "Search results do not match the search query");
		System.out.println(resultsText);
		System.out.println(driver.findElement(By.xpath("//div[@class='_3879cV']")).getText());
		
	}

}
