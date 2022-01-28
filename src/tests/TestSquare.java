package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Square;

/**
 * @author Corey Connor - cconnor3
 * CIS175 - Spring 2022
 * Jan 27, 2022
 */
public class TestSquare {

	Square s1 = new Square(5);
	Square s2 = new Square(0);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testArea_GoodInput() {
		double area = s1.Area();
		assertEquals(25, area, 0.0);
	}

	@Test
	public void testArea_Zeros() {
		double area = s2.Area();
		assertTrue(area == 0);
	}

	@Test
	public void testArea_MoreZeros() {
		double area = s2.Area();
		assertNotNull(area);
	}

	@Test
	public void testPerimeter_GoodInput() {
		double perimeter = s1.Perimeter();
		assertEquals(20, perimeter, 0.0);
	}

	@Test
	public void testPerimeter_Zeros() {
		double perimeter = s2.Perimeter();
		assertTrue(perimeter == 0);
	}

	@Test
	public void testPerimeter_MoreZeros() {
		double perimeter = s2.Perimeter();
		assertNotNull(perimeter);
	}

}