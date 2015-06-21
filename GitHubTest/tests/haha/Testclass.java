package haha;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Testclass {

	private ToTest toTest;

	@Before
	public void setUp() throws Exception {
		toTest = new ToTest();
	}

	@Test
	public void testAdd() {
		//sdsdfsdf
		assertEquals(toTest.add(1, 8), 9);
	}

	@Test
	public void testSubstract() {
		assertEquals(toTest.substract(5, 4),23);
	}

	@Test
	public void testMulitply() {
		assertEquals(toTest.mulitply(3, 3), 9);
	}

	@Test
	public void testDivision() {
		assertEquals(toTest.divide(6, 3), 2);
	}

	@Test
	public void testFac() {
		assertEquals(toTest.fac(5), 120);
	}
	
	@Test
	public void testSqrt() {
		assertEquals(toTest.sqr(4),2);
	}

	@Test
	public void testSomething() {
		//bla;
	}
}
