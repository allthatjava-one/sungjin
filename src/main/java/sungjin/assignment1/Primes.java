package sungjin.assignment1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
/**
 * 
 * @author Jin  Chun
 *
 */
public class Primes {
    private static final boolean Integer = false;

	public static void main(String [] args){
            System.out.println(primes(10000)[9999]);
            System.out.println(primesLessThan(10000));

            int n = 1000000;
            ArrayList<Integer> a;
            long start, end;
            
            /**
            start = System.currentTimeMillis();
            a = primesLessThan(n);
            end = System.currentTimeMillis();
            System.out.println(a.size()+ " " + (end-start));
            
            start = System.currentTimeMillis();
            a = primesLessThanSieveRemove(n);
            end = System.currentTimeMillis();
            System.out.println(a.size()+ " " + (end-start));
            
            start = System.currentTimeMillis();
            a = primesLessThanSieveAdd(n);
            end = System.currentTimeMillis();
            System.out.println(a.size()+ " " + (end-start));
            
            start = System.currentTimeMillis();
            a = primesLessThanSieveRemove2(n);
            end = System.currentTimeMillis();
            System.out.println(a.size()+ " " + (end-start));
            **/
    }
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		} else {
			for (int i = 2; i < n; i = i + 1) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public static int[] primes(int n) {
		int current = 2;
		int numPrimes = 0;
		int[] listOfPrimes = new int[n];

		while (numPrimes < n) {
			if (isPrime(current)) {
				listOfPrimes[numPrimes] = current;
				numPrimes = numPrimes + 1;
			}
			current = current + 1;
		}
		return listOfPrimes;
	}
	
	public static ArrayList<Integer> primesLessThan(int n) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i=2; i < n; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
	}
	
	public static ArrayList<Integer> primesLessThanSieveRemove(int n) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 2; i < n; i++) {
			nums.add(i);
		} 
		int j = 0;
		while(j < (nums.size()-1)) {
			int k = j + 1;
			while (k < nums.size()) {
				if (nums.get(k) % nums.get(j) == 0) {
					nums.remove(k);
				}
				k++;
			}
			j++;
		}
		return nums;
	}	
	
	public static ArrayList<Integer> primesLessThanSieveAdd(int n) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		mainloop: 
		for (int i = 2; i<n; i++) {
			for (int n1: primes) {
				if (i % n1 == 0) {
					continue mainloop;
				}
			}
			primes.add(i);
		}
		return primes;
	}

	public static ArrayList<Integer> primesLessThanSieveRemove2(int n) {
		ArrayList<Integer> primesArrayList = new ArrayList<Integer>();

		if (n < 2) {
			return primesArrayList;
		}
		else {
			boolean[] primes = new boolean[n];
			Arrays.fill(primes, true);
			primes[0] = false;
			primes[1] = false;
			
			int i = 2;
			while (i < (n-1)) {
				if (primes[i] == false) {
					continue;
				}
				int j = i + 1;
				while (j < n) {
					if (primes[j] == true && j % i ==0) {
						primes[j] = false;
					}
					j++;
				}
				i++;
			}
			
			for (int k = 2; k < n; k++) {
				if (primes[k] == true) {
					primesArrayList.add(k);
				}
			}
			return primesArrayList;
		}
	}
}
