package Search_Functionality;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseTest.Base_Test;


public class TC001 extends Base_Test {

	@Test
	public void search() throws InterruptedException {

		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
		WebElement searchField = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		searchField.sendKeys("phone123@#");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.attributeToBeNotEmpty(searchField, "value"));
		Assert.assertTrue(isSearchFieldValid(searchField.getAttribute("value")), "Invalid search query");
		 
	}


	
	private boolean isSearchFieldValid(String input) {
		// check if the input contains only alphabets,
		// numbers, or symbols
		return input.matches("^[a-zA-Z0-9!@#$%^&*()_+{}':;',.<>?/|\\[\\]~-]*$");
	}
}
