import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		search();

	}

	public static void search()
	{
		
		String projectpath= System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
		
		driver.close();
		
		System.out.println("test completed successfully");
				
	}
}
