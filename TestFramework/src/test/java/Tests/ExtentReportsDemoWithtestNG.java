package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemoWithtestNG {

	ExtentSparkReporter sparkReporter;
	ExtentReports extent;
	WebDriver driver;
	
	@BeforeSuite
	public void setup() {

		 sparkReporter = new ExtentSparkReporter("extentreports.html");

		// create ExtentReports and attach reporter(s)
		 extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
	}
	
	@BeforeTest
	public void setuptest()
	{
       String projectpath= System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		
	    driver= new ChromeDriver();
	}
	
	@Test
	public void test1() {
		
		
		ExtentTest test = extent.createTest("Google, search test","1st test");
		driver.get("https://www.google.co.in");
		test.pass("Navigated to google");
		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	}
	
	@Test
	public void test2() {
		
		
		ExtentTest test = extent.createTest("Google, search test","2nd test");
		
		driver.get("https://www.google.co.in");
		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	}
	
	@AfterTest
	public void closetest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}
	
	@AfterSuite
	public void teardown() {
		extent.flush();
	}
}
