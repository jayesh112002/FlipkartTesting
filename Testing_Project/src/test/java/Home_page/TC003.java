package Home_page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilityClass.Utility_Method;
import baseTest.Base_Test;

public class TC003 extends Base_Test {

	@Test
	public void SearchBox() throws InterruptedException, IOException {
		
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role ='button']")).click();
		driver.findElement(By.xpath("(//span)[1]")).click();
		driver.findElement(By.xpath("(//input[@type = 'text'])[2]")).sendKeys("9350411190");
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(100000);
		driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]")).click();
		Thread.sleep(2000);
		
	}
}
