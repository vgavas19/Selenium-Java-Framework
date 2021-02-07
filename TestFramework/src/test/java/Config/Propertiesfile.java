package Config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Tests.TestNG_Demo;



public class Propertiesfile {
	static Properties prop=new Properties();
	
	static String projectpath=System.getProperty("user.dir");
	public static void main(String[] args) {
		getprop();
		setprop();
		getprop();

	}

	public static void getprop() 
	{
		
		try {
			
			
			
			
			InputStream input=new FileInputStream(projectpath+"/src/test/java/Config/config.properties");
			
			prop.load(input);
			
			String browser=prop.getProperty("browser");
			
			System.out.println(browser);
			
			TestNG_Demo.browsername=browser;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	
	public static void setprop() 
	{
		
		try {
			OutputStream outputStream=new FileOutputStream(projectpath+"/src/test/java/Config/config.properties");
			prop.setProperty("result", "pass"
					+ "");
			prop.store(outputStream, null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	
}
