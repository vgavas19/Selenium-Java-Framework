package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.googlesearchpageobject;

public class TestNG {

	WebDriver driver=null;
	
	@BeforeTest
	public void setuptest()
	{
       String projectpath= System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		
	    driver= new ChromeDriver();
	}
	
	@Test
	public void googlesearchtest() throws InterruptedException {
		

	    
	    googlesearchpageobject searchpageobj=new googlesearchpageobject(driver);
	    
	    driver.get("https://www.google.co.in");
	    
	    searchpageobj.settextsearch("abcd");
	    
	    Thread.sleep(2000);
	    searchpageobj.clicksearch();
	    
	    
	}
	
	@AfterTest
	public void closetest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}
}
