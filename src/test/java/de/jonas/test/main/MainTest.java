package de.jonas.test.main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MainTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Main toTest = new Main();
		assertEquals(5, toTest.add(2, 5));
	}

}
