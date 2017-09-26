package brian.assignment.primes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import brian.assignment1.primes.Primes;

public class PrimesTest {
	
	@Test
	public void testIsPrime() {
		
		assertTrue("2", Primes.isPrime(2));
		assertTrue("3", Primes.isPrime(3));
		assertTrue("4", Primes.isPrime(4)==false);
		assertTrue("8", Primes.isPrime(8)==false);
		assertTrue("10", Primes.isPrime(10)==false);
		assertTrue("11", Primes.isPrime(11));
	}
	
	@Test
	public void testPrimes() {
		assertEquals("primes", 
				Arrays.toString(new int[]{2,3,5,7}), 
				Arrays.toString(Primes.primes(4)));
		assertEquals("primes", 
				Arrays.toString(new int[]{2,3,5,7,11,13,17,19,23,29}), 
				Arrays.toString(Primes.primes(10)));
	}
	
	@Test
	public void testLessThan() {
		assertEquals("primes", 
				Arrays.toString(new int[]{2,3}), 
				Arrays.toString(Primes.primesLessThan(4).toArray()));
		assertEquals("primes", 
				Arrays.toString(new int[]{2,3,5,7}), 
				Arrays.toString(Primes.primesLessThan(10).toArray()));
	}
	
	@Test
	public void testPrimesLessThanSieveRemove() {

		assertEquals("primes", 
				Arrays.toString(new int[]{2,3,5,7}),
				Arrays.toString(Primes.primesLessThanSieveRemove(10).toArray()));
		
		assertEquals("primes", 
				Arrays.toString(new int[]{2,3,5,7,11,13,17,19}),
				Arrays.toString(Primes.primesLessThanSieveRemove(20).toArray()));
	}
	

	@Test
	public void testPrimesLessThanSieveRemove2(){
//		List<Integer> result = Primes.primesLessThanSieveRemove2(10);
//		
//		List<Integer> expected = new ArrayList<>();
//		expected.add(new Integer(2));
//		expected.add(new Integer(3));
//		expected.add(new Integer(5));
//		expected.add(new Integer(7));
//		
//		Assert.assertEquals("result", expected, result);
	}
	
}
