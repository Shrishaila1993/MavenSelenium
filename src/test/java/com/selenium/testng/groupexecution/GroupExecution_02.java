package com.selenium.testng.groupexecution;

import org.testng.annotations.Test;

public class GroupExecution_02 {
	@Test(groups = "SmokeTesting")
	public void g2testCase_01() {
		System.out.println("TestCase_01 executed");
	}
	@Test(groups = "RegressionTesting")
	public void g2testCase_02() {
		System.out.println("TestCase_02 executed");
	}
	@Test(groups = "AdhocTesting")
	public void g2testCase_03() {
		System.out.println("TestCase_03 executed");
	}
	@Test(groups = "IntegrationTesting")
	public void g2testCase_04() {
		System.out.println("TestCase_04 executed");
	}
}
