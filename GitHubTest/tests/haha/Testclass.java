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
		assertEquals(toTest.add(5, 5),10);
	}

	@Test
	public void testSubstract() {
		assertEquals(toTest.substract(5, 4), 3);
	}

	@Test
	public void testMulitply() {
		assertEquals(toTest.mulitply(3, 2), 6);
	}

}
