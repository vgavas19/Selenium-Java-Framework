package Pages;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Object locators
public class googlesearchpageobject {

	WebDriver driver=null;
	
	
	By textbox_search=By.name("q");
	By button_search=By.name("btnK");
	
	
	public googlesearchpageobject(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	//Actions on object locators
	public void settextsearch(String text) 
	{
		driver.findElement(textbox_search).sendKeys(text);
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
	    WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.name("name")));
	}

	public void clicksearch() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
	
}



