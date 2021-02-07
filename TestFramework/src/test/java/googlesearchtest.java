import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.googlesearch;

public class googlesearchtest {

	static WebDriver driver= null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		search();

	}

	public static void search()
	{
		
		String projectpath= System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		
	    driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		googlesearch.textbox_search(driver).sendKeys("Automation step by step");
		
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		googlesearch.button_search(driver).sendKeys(Keys.RETURN);
		
		
		
		driver.close();
		
		System.out.println("test completed successfully");
				
	}
}
