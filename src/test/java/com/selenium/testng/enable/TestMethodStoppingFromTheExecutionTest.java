package com.selenium.testng.enable;

import org.testng.annotations.Test;

public class TestMethodStoppingFromTheExecutionTest {
	@Test
	public static void atestCase_01() {
		System.out.println("TestCase_01 has got Executed");
	}
		@Test(enabled = false)
	public static void btestCase_02() {
		System.out.println("Testcase_02 has got Executed");
	}
		@Test
	public static void ctestCase_03() {
		System.out.println("Testcase_03 has got executed");
	}
		@Test
	public static void dtestCase_04() {
		System.out.println("Testcase_04 has got Executed");
	}
}
