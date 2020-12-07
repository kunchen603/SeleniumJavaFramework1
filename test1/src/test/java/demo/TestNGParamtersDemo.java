package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParamtersDemo {

	@Test
	@Parameters({"MyName"})
	public void test(@Optional("kun") String name)
	{
		System.out.println("Name is: "+ name);
	}
}
