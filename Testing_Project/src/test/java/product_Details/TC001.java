package product_Details;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import baseTest.Base_Test;

public class TC001 extends Base_Test {

    @Test 
    public void verify_Image() throws InterruptedException {
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[@role ='button']")).click();
        driver.findElement(By.xpath("(//img[@alt='Image'])[20]")).click();
        Thread.sleep(3000);
        List<WebElement> imageElements = driver.findElements(By.xpath("//img[@loading ='eager']"));
        Thread.sleep(6000);
        for (WebElement imgElement : imageElements) {
            String srcAttribute = imgElement.getAttribute("src");
            if (srcAttribute != null && !srcAttribute.isEmpty()) {
                // Check if the image source is not empty
                if (imgElement.isDisplayed()) {
                    // Check if the image is displayed
                    System.out.println("Image displayed: " + srcAttribute);
                } else {
                    System.out.println("Image NOT displayed: " + srcAttribute);
                }
            } else {
                System.out.println("Broken Image: " + srcAttribute);
            }
        }
        Thread.sleep(10000);
        
    }
}

