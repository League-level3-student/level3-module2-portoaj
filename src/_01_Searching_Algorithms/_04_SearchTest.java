package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] names= {"a","b","c"};
		assertEquals(_00_LinearSearch.linearSearch(names, "a"), 0);
		assertEquals(_00_LinearSearch.linearSearch(names, "b"), 1);
		assertEquals(_00_LinearSearch.linearSearch(names, "c"), 2);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int [] values = {0, 2, 4};
		assertEquals(_01_BinarySearch.binarySearch(values, 0, values.length, 0), 0);
		assertEquals(_01_BinarySearch.binarySearch(values, 0, values.length, 2), 1);
		assertEquals(_01_BinarySearch.binarySearch(values, 0, values.length, 4), 2);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int [] values = {0, 2, 4};
		assertEquals(_02_InterpolationSearch.interpolationSearch(values, 0), 0);
		assertEquals(_02_InterpolationSearch.interpolationSearch(values, 2), 1);
		assertEquals(_02_InterpolationSearch.interpolationSearch(values, 4), 2);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int [] values = {0, 2, 4};
		assertEquals(_03_ExponentialSearch.exponentialSearch(values, 0), 0);
		assertEquals(_03_ExponentialSearch.exponentialSearch(values, 2), 1);
		assertEquals(_03_ExponentialSearch.exponentialSearch(values, 4), 2);
	}
}
