package Home_page;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import baseTest.Base_Test;

public class TC003 extends Base_Test {

	@Test
	public void SearchBox() throws InterruptedException, IOException {
		
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role ='button']")).click();
		driver.findElement(By.xpath("(//span)[1]")).click();
		driver.findElement(By.xpath("(//input[@type = 'text'])[2]")).sendKeys("8307746282");
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(100000);
		List<WebElement> lis = driver.findElements(By.xpath("//span[@class='_1XjE3T']"));

		for (WebElement element : lis) {
		    System.out.println("TC003--"+element.getText());
		}

		
	}
}
