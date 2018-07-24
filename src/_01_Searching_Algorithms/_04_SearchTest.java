package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	String[] linSearch = new String[] {"one","two","three", "four", "five", "six"};
	int[] binSearch = new int[] {14,18,24,29,31,39,71,79,91,99,100};
	int[] interSearch = new int[] {10,20,30,40,50,60,70,80,90,100};
	
	@Test
	void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		assertEquals(0, _00_LinearSearch.linearSearch(linSearch, "one"));
		assertEquals(3, _00_LinearSearch.linearSearch(linSearch, "four"));
		assertEquals(-1, _00_LinearSearch.linearSearch(linSearch, "seven"));
	}

	@Test
	void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		assertEquals(5, _01_BinarySearch.binarySearch(binSearch, 0, binSearch.length, 39));
		assertEquals(0, _01_BinarySearch.binarySearch(binSearch, 0, binSearch.length, 14));
		assertEquals(8, _01_BinarySearch.binarySearch(binSearch, 0, binSearch.length, 91));
		assertEquals(-1, _01_BinarySearch.binarySearch(binSearch, 0, binSearch.length, 40));
	}
	
	@Test
	void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		assertEquals( 5, _02_InterpolationSearch.interpolationSearch(interSearch, 60));
		assertEquals( 2, _02_InterpolationSearch.interpolationSearch(interSearch, 30));
		assertEquals( 0, _02_InterpolationSearch.interpolationSearch(interSearch, 10));
		assertEquals( -1, _02_InterpolationSearch.interpolationSearch(interSearch, 110));

		
	}
	
	@Test
	void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
