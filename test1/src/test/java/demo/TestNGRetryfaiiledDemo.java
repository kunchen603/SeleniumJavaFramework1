package demo;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGRetryfaiiledDemo {

	@Test
	public void test1()
	{
		System.out.println("I am insdie test1");
	}
	
	@Test
	public void test2()
	{
		//int i=1/0;
		System.out.println("I am insdie test2");
	}
	@Test(retryAnalyzer = listeners.RetryAnalyzer.class)
	public void test3()
	{
		System.out.println("I am insdie test3");
		Assert.assertTrue(0>1);
	}
}
