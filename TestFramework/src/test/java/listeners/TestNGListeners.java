package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
	System.out.println("********* test started:"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("********* test success:"+result.getName());	
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("********* test failed:"+result.getName());
	
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("********* test skipped:"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("********* test completed:"+context.getName());
	}

}
