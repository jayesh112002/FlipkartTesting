package Home_page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTest.Base_Test;
import utilityClass.Utility_Method;

public class TC004 extends Base_Test {

	@Test
	public void SearchBox() throws InterruptedException, IOException {

		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role ='button']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]"));
		Boolean check = search.isDisplayed();
		System.out.println("TC004"+check);
		search.sendKeys("mobile");
		Thread.sleep(2000);
		
	}
}
