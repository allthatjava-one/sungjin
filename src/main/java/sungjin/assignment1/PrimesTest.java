package sungjin.assignment1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimesTest {

	// Add in a testXX for each public method XX in Primes

	@Test
	public void testIsPrime() {
		assertEquals("2 is prime", true, Primes.isPrime(2));
		assertEquals("3 is prime", true, Primes.isPrime(3));
		assertEquals("5 is prime", true, Primes.isPrime(5));
		assertEquals("11 is prime", true, Primes.isPrime(11));
		assertEquals("101 is prime", true, Primes.isPrime(101));

		assertEquals("-7 is not prime", false, Primes.isPrime(-7));
		assertEquals("-1 is not prime", false, Primes.isPrime(-1));
		assertEquals("0 is not prime", false, Primes.isPrime(-0));
		assertEquals("1 is not prime", false, Primes.isPrime(1));
		assertEquals("4 is not prime", false, Primes.isPrime(4));
		assertEquals("6 is not prime", false, Primes.isPrime(6));
	}
	
	@Test
	public void testPrimesLessThanSieveRemove() {
		//When n is -10, -0, 0, 1, or 2, an empty ArrayList should result. 
		List<Integer> result1 = Primes.primesLessThanSieveRemove(-10);
		assertEquals("size", 0, result1.size());
		List<Integer> result2 = Primes.primesLessThanSieveRemove(-0);
		assertEquals("size", 0, result2.size());
		List<Integer> result3 = Primes.primesLessThanSieveRemove(0);
		assertEquals("size", 0, result3.size());
		List<Integer> result4 = Primes.primesLessThanSieveRemove(1);
		assertEquals("size", 0, result4.size());
		List<Integer> result5 = Primes.primesLessThanSieveRemove(2);
		assertEquals("size", 0, result5.size());
		assertNotEquals("size", -1, result1.size());		
		List<Integer> result6 = Primes.primesLessThanSieveRemove(3);
		assertEquals("size", 1, result6.size());
		assertEquals("first value", 2, result6.get(0).intValue());
		List<Integer> result6Expected = Arrays.asList(2);		
		assertEquals("array list", result6Expected, result6);
		List<Integer> result7 = Primes.primesLessThanSieveRemove(10);
		List<Integer> result7Expected = Arrays.asList(2, 3, 5, 7);
		assertEquals("array list", result7Expected, result7);
		List<Integer> result8 = Primes.primesLessThanSieveRemove(20);
		List<Integer> result8Expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);
		assertEquals("array list", result8Expected, result8);
		List<Integer> result9 = Primes.primesLessThanSieveRemove(300);
		List<Integer> result9Expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163 ,167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293);
		assertEquals("array list", result9Expected, result9);
	}
	
	@Test
	public void testPrimesLessThanSieveAdd() {
		//When n is -10, -0, 0, 1, or 2, an empty ArrayList should result. 
		List<Integer> result1 = Primes.primesLessThanSieveAdd(-10);
		assertEquals("size", 0, result1.size());
		List<Integer> result2 = Primes.primesLessThanSieveAdd(-0);
		assertEquals("size", 0, result2.size());
		List<Integer> result3 = Primes.primesLessThanSieveAdd(0);
		assertEquals("size", 0, result3.size());
		List<Integer> result4 = Primes.primesLessThanSieveAdd(1);
		assertEquals("size", 0, result4.size());
		List<Integer> result5 = Primes.primesLessThanSieveAdd(2);
		assertEquals("size", 0, result5.size());
		assertNotEquals("size", -1, result1.size());		
		List<Integer> result6 = Primes.primesLessThanSieveAdd(3);
		assertEquals("size", 1, result6.size());
		assertEquals("first value", 2, result6.get(0).intValue());
		List<Integer> result6Expected = Arrays.asList(2);		
		assertEquals("array list", result6Expected, result6);
		List<Integer> result7 = Primes.primesLessThanSieveAdd(10);
		List<Integer> result7Expected = Arrays.asList(2, 3, 5, 7);
		assertEquals("array list", result7Expected, result7);
		List<Integer> result8 = Primes.primesLessThanSieveAdd(20);
		List<Integer> result8Expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);
		assertEquals("array list", result8Expected, result8);
		List<Integer> result9 = Primes.primesLessThanSieveAdd(300);
		List<Integer> result9Expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163 ,167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293);
		assertEquals("array list", result9Expected, result9);
	}
	@Test
	public void testPrimesLessThanSieveRemove2() {
		//When n is -10, -0, 0, 1, or 2, an empty ArrayList should result. 
		List<Integer> result1 = Primes.primesLessThanSieveRemove2(-10);
		assertEquals("size", 0, result1.size());
		List<Integer> result2 = Primes.primesLessThanSieveRemove2(-0);
		assertEquals("size", 0, result2.size());
		List<Integer> result3 = Primes.primesLessThanSieveRemove2(0);
		assertEquals("size", 0, result3.size());
		List<Integer> result4 = Primes.primesLessThanSieveRemove2(1);
		assertEquals("size", 0, result4.size());
		List<Integer> result5 = Primes.primesLessThanSieveRemove2(2);
		assertEquals("size", 0, result5.size());
		assertNotEquals("size", -1, result1.size());	
		List<Integer> result6 = Primes.primesLessThanSieveRemove2(3);
		assertEquals("size", 1, result6.size());
		assertEquals("first value", 2, result6.get(0).intValue());
		List<Integer> result6Expected = Arrays.asList(2);		
		assertEquals("array list", result6Expected, result6);
		List<Integer> result7 = Primes.primesLessThanSieveRemove2(10);
		List<Integer> result7Expected = Arrays.asList(2, 3, 5, 7);
		assertEquals("array list", result7Expected, result7);
		List<Integer> result8 = Primes.primesLessThanSieveRemove2(20);
		List<Integer> result8Expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);
		assertEquals("array list", result8Expected, result8);
		List<Integer> result9 = Primes.primesLessThanSieveRemove2(300);
		List<Integer> result9Expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163 ,167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293);
		assertEquals("array list", result9Expected, result9);
	}

}
