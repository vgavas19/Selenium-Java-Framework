package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;
import com.google.inject.spi.Element;



public class FluentWaitdemo {

	public static void main(String[] args) throws InterruptedException {
		test();
	}
	
	public static void test() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Vaibhav Gavas/eclipse-workspace/TestFramework/drivers/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("abcd");
		Thread.sleep(2000);
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		//driver.findElement(By.linkText("ABCD - NIMH Data Archive - NIH")).click();


		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30,TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement linkelement= driver.findElement(By.xpath("//span[contains(text(),'ABCD - NIMH Data Archive - NIH')]"));
				
				if(linkelement.isEnabled())
				{
					System.out.println("element found");
				}
				return linkelement;
			}
		});
		
		element.click();
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	}
}
