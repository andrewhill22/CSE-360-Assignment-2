package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cse360assign2.simpleList;

class simpleListTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void testAlpha() {
		
		simpleList testList = new simpleList();
		
		testList.add(4);
		testList.add(2);
		testList.add(4);
		testList.add(6);
		testList.add(8);
		
		String testAlphaOutput = testList.toString();
		System.out.print(testAlphaOutput);
		assertEquals(" 8 6 4 2 4 ", testAlphaOutput);
		
	}
	
	@Test
	void testBravo() {
		
		simpleList testList = new simpleList();
		
		testList.add(4);
		testList.add(2);
		testList.add(4);
		testList.add(6);
		testList.add(1);
		testList.remove(2);
		
		String testBravoOutput = testList.toString();
		System.out.print(testBravoOutput);
		assertEquals(" 1 6 2 4 ", testBravoOutput);
		
	}
	
	
	@Test
	void testCharlie() {
		
		simpleList testList = new simpleList();
		
		testList.add(19);
		testList.add(14);
		testList.add(45);
		testList.add(23);
		testList.add(11);
		testList.add(40);
		testList.add(61);

		
		int testCharlieOutput = testList.count();
		System.out.print(testCharlieOutput);
		assertEquals(7, testCharlieOutput);
		
	}

}