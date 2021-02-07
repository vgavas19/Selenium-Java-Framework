package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.Propertiesfile;
import Pages.googlesearchpageobject;

public class TestNG_Demo {

	WebDriver driver=null;
	public static String browsername=null;
	
	
	@BeforeTest
	public void setuptest()
	{
		String projectpath= System.getProperty("user.dir");
		Propertiesfile.getprop();
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
			driver= new ChromeDriver();
		}
		
	    
	}
	
	@Test
	public void googlesearchtest2() throws InterruptedException {
		

	    
	    googlesearchpageobject searchpageobj=new googlesearchpageobject(driver);
	    
	    driver.get("https://www.google.co.in");
	    
	    searchpageobj.settextsearch("abcd");
	    
	    Thread.sleep(2000);
	    searchpageobj.clicksearch();
	    
	    
	}
	
	@Test
	public void googlesearchtest3() throws InterruptedException {
		

	    
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
		Propertiesfile.setprop();
	}
}
