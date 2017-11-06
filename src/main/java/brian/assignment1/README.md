#Q1

---
Question 1: NonOO Java
In your repo, you will find the Assignment1 project. 
Implement the Primes class as described below (some methods may already be implemented for you). 
Include Javadoc and JUnit test cases. I have already started some for you, see the PrimesTest class. 
All methods below are static


isPrime(n) which returns whether integer n is prime.
primes(n) which returns an array of the first n primes.
primesLessThan(n) which returns 
 an ArrayList of primes less than n by repeatedly calling isPrime on 2,3,4,...,n-1.
primesLessThanSieveRemove(n) which maintains 
 and returns an ArrayList of primes less than n using the following algorithm. 
We use pythons array notation to index into the array list below.

fill ArrayList primes with numbers 2,3,..., n-1
remove multiples of primes[0] from primes[1:] (this removes all multiples of 2 from primes, leaving 2 in primes)
remove multiples of primes[1] from primes[2:] (this removes all multiples of 3 from primes, leaving 3 in primes)
remove multiples of primes[2] from primes[3:] (this removes all multiples of 5 from primes, leaving 5 in primes)
...
finally return whats left of primes
Add in any improvements to the algorithm you can think of to improve performance while maintaining the basic algorithm. 
Consider using primesLessThan(n) to help with unit testing of primesLessThanSieveRemove. 
The general technique is to use simpler code you trust to help test complex code you don't.
primesLessThanSieveAdd(n) which returns an ArrayList of primes less than n

This time, start with an empty ArrayList primes, 
for i range(2,n):
    check that none of the current members of primes divides i
    if none do, then add i to primes
Finally return primes.
Again, add in any improvements you can think of to improve performance while maintaining the basic algorithm.

For primesLessThanSieveRemove2(n)

start with a boolean array, primes, of size n, with all entries set to true
now set each primes[j] to false, if it is a multiple of 2 (and not 2).
Next set primes[j] to false, if it is a multiple of 3 (and not 3),
We see that primes[4] is false so we skip it.
We see that primes[5] is true, so we set primes[j] to false, if it is a 
multiple of 5 (and not 5). We stop when we know that we have only
primes[j] = true, if j is a prime.

Finally, copy all j such that primes[j]=true into an ArrayList and return it.
Which of the primesLessThan* is fastest? Why?
