package Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	
	public static void main(String[] args) throws Exception {
		test1();
	}

	public static void test1() throws Exception {
		
		String projectpath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://tinyupload.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/input[2]")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\FileUploadScript.exe");
		
		Thread.sleep(3000);
		driver.close();
	}
}
