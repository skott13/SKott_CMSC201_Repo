import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/*
 * Class: CMSC201 
 * Instructor:
 * Description: (A JUnit test class to test the methods in the java.lang class)
 * Due: 05/02/2023
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sholom Kott
*/

//class that test java.lang methods
public class StringTest {
	//create String to test java.lang methods.
	String s = "Never Eat Soggy Waffles";

	@Before
	//open JUnit test environment 
	public void setUp() throws Exception {
	}

	@After
	//close JUnit test environment 
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//test that the length of the test string is equal to 23
		assertEquals(s.length(),23);
		//test that the letter at index 0 is 'N'
		assertEquals(s.charAt(0),'N');
		//test that the letter at index 7 is 'a'
		assertEquals(s.charAt(7),'a');
		//test that the letter at index 14 is 'y'
		assertEquals(s.charAt(14),'y');
		//test that the letter at index 21 is 'e'
		assertEquals(s.charAt(21),'e');
		//test that the substring between index 0 and 2 is "NE"
		assertEquals(s.substring(0,2),"Ne");
		//test that the substring between index 4 and 8 is "r Ea"
		assertEquals(s.substring(4,8),"r Ea");
		//test that the substring between index 10 and 15 is "Soggy"
		assertEquals(s.substring(10,15),"Soggy");
		//test that the substring  between index 13 and 23 is "gy Waffles"
		assertEquals(s.substring(13,23),"gy Waffles");
		//tests that the index of the letter 'N' is 0
		assertEquals(s.indexOf('N'),0);
		//tests that the index of the letter 'E' is 6
		assertEquals(s.indexOf('E'),6);
		//tests that the index of the letter 'S' is 10
		assertEquals(s.indexOf('S'),10);
		//tests that the index of the letter 'W' is 16
		assertEquals(s.indexOf('W'),16);
	}

}
