import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//class that tests the PrimeNumberMethod
public class PrimeNumberMethodTest {

	@Before
	//open JUnit test environment 
	public void setUp() throws Exception {
	}

	@After
	//close JUnit test environment 
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsPrime() {
		//test the first 10 prime numbers 
		assertTrue(PrimeNumberMethod.isPrime(2));
		assertTrue(PrimeNumberMethod.isPrime(3));
		assertTrue(PrimeNumberMethod.isPrime(5));
		assertTrue(PrimeNumberMethod.isPrime(7));
		assertTrue(PrimeNumberMethod.isPrime(11));
		assertTrue(PrimeNumberMethod.isPrime(13));
		assertTrue(PrimeNumberMethod.isPrime(17));
		assertTrue(PrimeNumberMethod.isPrime(19));
		assertTrue(PrimeNumberMethod.isPrime(23));
		assertTrue(PrimeNumberMethod.isPrime(29));
		//test the first 10 non prime numbers
		assertFalse(PrimeNumberMethod.isPrime(4));
		assertFalse(PrimeNumberMethod.isPrime(6));
		assertFalse(PrimeNumberMethod.isPrime(8));
		assertFalse(PrimeNumberMethod.isPrime(9));
		assertFalse(PrimeNumberMethod.isPrime(10));
		assertFalse(PrimeNumberMethod.isPrime(12));
		assertFalse(PrimeNumberMethod.isPrime(14));
		assertFalse(PrimeNumberMethod.isPrime(15));
		assertFalse(PrimeNumberMethod.isPrime(16));
		assertFalse(PrimeNumberMethod.isPrime(18));
	}

}
