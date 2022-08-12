package com.selenium.testng.ignore;

import org.testng.annotations.*;

public class IgnoreMethod {
	@Ignore
	@Test	
	public void LionTest() {
		System.out.println("Lion is the King Of The Forest");
	}
	@Test
	public void ElephantTest() {
		System.out.println("Elephant is the king of the forest");
	}
	@Test
	public void TigerTest() {
		System.out.println("Tiger is the king of the forest");
	}
	@Test
	public void RhinoTest() {
		System.out.println("Rhino is the king of the forest");
	}
}
