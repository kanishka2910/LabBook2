package com.cg.Exercise1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppTest {
	
	private App a;
	private static int SINGLE_NUMBER = 100;
	
	@Before
	public void setup() {
		a=new App();
	}
	

	@Test
	public void test_getSecondSmallest_GivenEmptyIntegerArray_ShouldReturn0AsInteger() {
		int newNumbers[]= {};
		int result = a.getSecondSmallest(newNumbers);
		assertEquals(0, result);
	}
	
	@Test
	public void test_getSecondSmallest_Given1InIntegerArray_ShouldReturn1AsInteger() {
		int newNumbers[]= {SINGLE_NUMBER};
		int result = a.getSecondSmallest(newNumbers);
		assertEquals(SINGLE_NUMBER, result);
	}
	
	@Test
	public void test_getSecondSmallest_Given20And5InIntegerArray_ShouldReturn20AsInteger() {
		int newNumbers[]= {7,3,12};
		int result = a.getSecondSmallest(newNumbers);
		assertEquals(7, result);
	}
	
	
	/*public void test_getSecondSmallest_Given20,7,5IntegerArray_ShouldReturn7AsInteger() {
		int newNumbers[]= {20,7,5};
		int result = a.getSecondSmallest(newNumbers);
		assertEquals(7, result);
	}*/
	
	

}