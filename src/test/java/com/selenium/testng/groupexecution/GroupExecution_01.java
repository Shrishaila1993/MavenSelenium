package com.selenium.testng.groupexecution;

import org.testng.annotations.Test;

public class GroupExecution_01 {
	@Test(groups = "AdhocTesting")
	public void g1testCase_01() {
		System.out.println("TestCase_01 executed");
	}
	@Test(groups = "IntegrationTesting")
	public void g1testCase_02() {
		System.out.println("TestCase_02 executed");
	}
	@Test(groups = "SmokeTesting")
	public void g1testCase_03() {
		System.out.println("TestCase_03 executed");
	}
	@Test(groups = "RegressionTesting")
	public void g1testCase_04() {
		System.out.println("TestCase_04 executed");
	}
}
