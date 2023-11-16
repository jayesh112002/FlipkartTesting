package utilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility_Method {
	public static void captureElementScreenshot(WebDriver driver, WebElement element, String filePath)throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotFile = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(filePath));
	}

	public static void captureScreenshot(WebDriver driver, String filePath) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(filePath));
	}

	public static String getPropertyValue(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./Testdata/commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	public static WebDriver openBrowserC() throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com");
	    driver.manage().window().maximize();
	    return driver;
	}
	
	public static WebDriver openBrowserF() throws InterruptedException {
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.flipkart.com");
	    driver.manage().window().maximize();
	    return driver;
	}

}
