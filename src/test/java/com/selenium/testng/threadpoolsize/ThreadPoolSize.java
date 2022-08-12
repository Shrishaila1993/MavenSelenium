package com.selenium.testng.threadpoolsize;

import org.testng.annotations.Test;

public class ThreadPoolSize {
	@Test(invocationCount = 02)
	public void testThreadPools() {

		System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
		System.out.println("Threads of Java allows a program to operate more efficiently by doing multiple things at the same time");	
	  }
}
