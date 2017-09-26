package brian.assignment1.primes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Primes {
    public static void main(String [] args){
//            System.out.println(primes(10000)[9999]);
//            System.out.println(primesLessThan(10000));	// FIXME : Original Code

//            int n = 1000000;
    		int n = 10000;
            List<Integer> a;
            long start, end;
            
            start = System.currentTimeMillis();
            a = primesLessThan(n);
            end = System.currentTimeMillis();
            System.out.println(a.size()+ " " + (end-start));
            
            start = System.currentTimeMillis();
            a = primesLessThanSieveRemove(n);
            end = System.currentTimeMillis();
            System.out.println(a.size()+ " " + (end-start));
            
            /**
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
		int num_primes = 0;
		int[] list_of_primes = new int[n];

		while (num_primes < n) {
			if (isPrime(current)) {
				list_of_primes[num_primes] = current;
				num_primes = num_primes + 1;
			}
			current = current + 1;
		}
		return list_of_primes;
	}
	
	public static List<Integer> primesLessThan(int n)
	{
		List<Integer> primes = new ArrayList<>();
		
		for (int i = 2; i < n; i++) 
		{
			if(isPrime(i))
			{
				primes.add(i);
			}
		}
		
		return primes;
	}
	
	public static List<Integer> primesLessThanSieveRemove(int n)
	{
		List<Integer> primesToBe = new ArrayList<>();
		
		// Init
		int counter = 2;
		while( counter < n )
		{
			primesToBe.add(counter);
			counter++;
		}
		
		// Remove non primes
		int startingIndex =0;

		while( startingIndex != primesToBe.size() )
		{
			int cursor = startingIndex+1;
			int keyPrimeNo = primesToBe.get(startingIndex);
			
			while(cursor != primesToBe.size())
			{
				if( primesToBe.get(cursor) % keyPrimeNo == 0 )
				{
					primesToBe.remove(cursor);
				}
				else
				{
					cursor++;
				}
			}
			
			startingIndex++;
		}
		
		return primesToBe;
	}
	
	/**
	 * 
start with a boolean array, primes, of size n, with all entries set to true
now set each primes[j] to false, if it is a multiple of 2 (and not 2).
Next set primes[j] to false, if it is a multiple of 3 (and not 3),
We see that primes[4] is false so we skip it.
We see that primes[5] is true, so we set primes[j] to false, if it is a 
multiple of 5 (and not 5). We stop when we know that we have only
primes[j] = true, if j is a prime.

Finally, copy all j such that primes[j]=true into an ArrayList and return it.
Which of the primesLessThan* is fastest? Why?
	 * @param n
	 * @return
	 */
	public static List<Integer> primesLessThanSieveRemove2(int n)
	{
		List<Integer> result = new ArrayList<>();
		boolean[] primes = new boolean[n];
		Arrays.fill(primes, true);
		
		for(int j=2; j < n; j++)
		{
			for(int i=2; i < j; i++)
			{
				if( j%i == 0 && j != 2)
				{
					primes[j]=false;
				}
			}
		}
		
		System.out.println(Arrays.toString(primes));
		
		return result;
	}
}




