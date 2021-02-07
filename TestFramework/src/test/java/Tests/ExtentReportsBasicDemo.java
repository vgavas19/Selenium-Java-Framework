package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportsBasicDemo {
	
	//private static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentreports.html");
		
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google, search test","1st test");
        
        String projectpath= System.getProperty("user.dir");
		
 		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
 		
 		WebDriver driver= new ChromeDriver();
 	    
 	   test1.log(Status.INFO, "starting test case");
 	   driver.get("https://www.google.co.in");
 	   
 	   test1.pass("Navigated to google");
 	   driver.findElement(By.name("q")).sendKeys("Automation");
 	   test1.pass("enter message in textbox");
 	   
 	   Thread.sleep(2000);
 	   
 	   driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
 	   test1.pass("press enter key");
 	   
 	   driver.close();
 	   
 	   driver.quit();
 	   test1.pass("closed browser");
 	   
 	   test1.pass("report completed");
 	   
 	   
 	   //////////////////////////////
 	   
 	  // creates a toggle for the given test, adds all log events under it    
       ExtentTest test2 = extent.createTest("Google, search test","1st test");
       
       driver= new ChromeDriver();
	    
	   test2.log(Status.INFO, "starting test case");
	   driver.get("https://www.google.co.in");
	   
	   test2.pass("Navigated to google");
	   driver.findElement(By.name("q")).sendKeys("Automation");
	   test2.pass("enter message in textbox");
	   
	   Thread.sleep(2000);
	   
	   driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	   test2.fail("press enter key");
	   
	   driver.close();
	   
	   driver.quit();
	   test2.pass("closed browser");
	   
	   test2.pass("report completed");
 	   
       // calling flush writes everything to the log file
       extent.flush();
	}

}
