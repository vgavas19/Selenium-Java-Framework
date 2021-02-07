package Demo;

import org.testng.annotations.Test;

public class TestNGpriorityDemo {

	@Test
	public void One() {
		System.out.println("Inside Test1");
		
	}
	
	@Test
	public void Two() {
		
		System.out.println("Inside Test2");
	}
	
	@Test
	public void Three() {
		
		System.out.println("Inside Test3");
	}
}
