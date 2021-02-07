package Demo;



import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

public class TestNGRetryFailed {
	
	@Test
	public void test1() {
		System.out.println("inside test1");
	}
	
	@Test(retryAnalyzer=listeners.TestRetry.class)
	public void test2() {
		System.out.println("inside test2");
		int i=1/0;
		
	}
	
	@Test
	public void test3() {
		System.out.println("inside test3");
	}
}
