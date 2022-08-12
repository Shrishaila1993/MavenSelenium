package com.selenium.testng.invocationcount;

import org.testng.annotations.Test;

public class TestNGClassWithInvocationCount {
	public static void testCase01Test() {
		System.out.println("TC_01 Steps will be automated here");
	}
	//Execution begins from here 
	public static void testCase02Test() {
		System.out.println("TC_02 Steps will be automated here");
	}
	@Test(invocationCount = 0)
	public static void testCase03Test() {
		System.out.println("TC_03 Steps will be automated here");
	}
	@Test(invocationCount = -1)
	public static void testCase04Test() {
		System.out.println("TC_04 Steps will be automated here");
	}
	@Test(invocationCount = 02)
	public static void testCase05Test() {
		System.out.println("TC_05 Steps will be automated here");
	}

	public static void testCase06Test() {
		System.out.println("TC_06 Steps will be automated here");
	}
}
