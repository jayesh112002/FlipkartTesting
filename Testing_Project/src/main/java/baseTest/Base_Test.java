package baseTest;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base_Test {
	protected static WebDriver driver;
	protected static Properties prop = new Properties();
	protected static FileReader fr;

	@BeforeMethod
	public static void setUp() throws IOException {

		if (driver == null) {
			 fr = new FileReader(
					System.getProperty("user.dir") + "\\resources\\properties\\testdata.properties");
			prop.load(fr);
		}

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testurl"));
		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testurl"));
		} else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.get(prop.getProperty("testurl"));
		}

	}

	public static void takeScreenshot() throws IOException {
		Date currentdate = new Date();

		String screenshotfilename = currentdate.toString().replace(" ", "-").replace(":", "-");

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(screenshotFile, new File(".//screenshot/" + screenshotfilename + ".png"));

	}

	@AfterMethod
	public static void tearDown() {
		driver.quit();
	}
}
