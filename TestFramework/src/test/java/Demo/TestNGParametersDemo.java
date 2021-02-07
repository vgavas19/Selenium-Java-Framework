package Demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {

	@Test
	@Parameters({"myname"})
	public void test(@Optional("vaibhav") String name)
	{
		System.out.println("Name is:"+name);
	}
}
