package com.selenium.testng.dependenies;

import org.testng.annotations.Test;

public class UsageOfDependenyWithGroups {
	@Test(groups = "AdhocTesting")
	public void g1testCase_01() {
		System.out.println("TestCase_01 executed");
	}
	@Test(groups = "RegressionTesting")
	public void g1testCase_02() {
		System.out.println("TestCase_02 executed");
	}
	@Test(groups = "RegressionTesting")
	public void g1testCase_03() {
		System.out.println("TestCase_03 executed");
	}
	@Test(groups = "RegressionTesting")
	public void g1testCase_04() {
		System.out.println(5/0);
		System.out.println("TestCase_04 executed");
	}
	@Test(dependsOnGroups = "RegressionTesting")
	public void dependencyOnGroup() {
		System.out.println("DependencyOnGroups");
	}
}
