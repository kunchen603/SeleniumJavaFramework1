package listeners;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenerDemo2 {
     @Test
	public void test4()
	{
		System.out.println("i am inside test4");
	}
     @Test
	public void test5()
	{
		System.out.println("i am inside test5");
		Assert.assertTrue(false);
	}
     @Test
	public void test6()
	{
		System.out.println("i am inside test6");
		throw new SkipException("this test is skipped");
	}
}
