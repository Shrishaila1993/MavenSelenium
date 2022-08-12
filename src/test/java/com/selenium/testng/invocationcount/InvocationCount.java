package com.selenium.testng.invocationcount;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 0)
	public void tigerTest()
	{
		lionTest();
		System.out.println("Tiger is the king");
	}
	@Test(invocationCount = -1)
	public void elephantTest()
	{
		System.out.println("Elephant is the king");
	}
	@Test(invocationCount = 02)
	public void lionTest()
	{
		System.out.println("Lion is the king");
	}
}
