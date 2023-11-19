package utilityClass;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import baseTest.Base_Test;

public class ListenerClass extends Base_Test implements ITestListener{
		
	public void onTestFailure(ITestResult result) {
		try {
			takeScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
