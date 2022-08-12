package com.selenium.testng.basic;

import org.testng.annotations.Test;


public class ForestKingTest {
	
	@Test
	public void tigerTest()
	{
		lionTest();
		System.out.println("Tiger is the king");
	}
	@Test
	public void elephantTest()
	{
		System.out.println("Elephant is the king");
	}

	public void lionTest()
	{
		System.out.println("Lion is the king");
	}
}


