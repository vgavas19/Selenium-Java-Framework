package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {

	
	WebDriver driver=null;
	String projectpath= System.getProperty("user.dir");
	
	@Parameters("browsername")
	@BeforeTest
	
	public void setup(String browsername) {
		System.out.println("Browsername is:" +browsername);
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
			
		    driver= new ChromeDriver();
		}
		    else if(browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", projectpath+"/drivers/Firefoxdriver/geckodriver.exe");
				
			    driver= new FirefoxDriver();
		}
		    
		    else if(browsername.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
				
			    driver= new ChromeDriver();
		}
		
	}
	
	@Test
	public void test1() throws InterruptedException {
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("Test completed successfully");
	}
}
