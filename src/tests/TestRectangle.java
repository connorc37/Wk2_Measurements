package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Rectangle;

/**
 * @author Corey Connor - cconnor3 
 * CIS175 - Spring 2022 
 * Jan 27, 2022
 */
public class TestRectangle {

	Rectangle r1 = new Rectangle(2, 4);
	Rectangle r2 = new Rectangle(0, 0);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testArea_GoodInput() {
		double area = r1.Area();
		assertEquals(8, area, 0.0);
	}

	@Test
	public void testArea_Zeros() {
		double area = r2.Area();
		assertTrue(area == 0);
	}

	@Test
	public void testArea_MoreZeros() {
		double area = r2.Area();
		assertNotNull(area);
	}

	@Test
	public void testPerimeter_GoodInput() {
		double perimeter = r1.Perimeter();
		assertEquals(12, perimeter, 0.0);
	}

	@Test
	public void testPerimeter_Zeros() {
		double perimeter = r2.Perimeter();
		assertTrue(perimeter == 0);
	}

	@Test
	public void testPerimeter_MoreZeros() {
		double perimeter = r2.Perimeter();
		assertNotNull(perimeter);
	}

}