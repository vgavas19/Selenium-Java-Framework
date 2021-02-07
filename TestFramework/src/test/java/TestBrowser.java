import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowser {

public static void main(String[] args) {
	
    System.setProperty("webdriver.chrome.driver", "C:/Users/Vaibhav Gavas/eclipse-workspace/TestFramework/drivers/chromedriver/chromedriver.exe");
    //System.setProperty("webdriver.chrome.driver", "D:/Softwares/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.get("https://tucltest.crmnext.com/Sn3_New/app/login/login");
}
 
 	
}
