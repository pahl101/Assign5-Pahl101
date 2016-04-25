import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author MadisonPahl
 *
 */
public class EquilateralTriangleTest{
	
	EquilateralTriangle equilT;
	int s;


	/**
	 * @throws java.lang.Exception
	 * exception to ensure that it works
	 */
	@Before
	public void setUp() throws Exception {
		s = 2;
		equilT = new EquilateralTriangle(s);
		
		
	}
	@Test
	public void testEquilateralTriangle() throws Exception {

	}

	@Test
	public void testValidateInput() {
		assertTrue(equilT.validateInput(s,s,s));
		assertFalse(equilT.validateInput(1, s,s));
		

	}


	@Test
	public void testGetPerimeter() {
		
		double equilP = equilT.getPerimeter();
		assertEquals(6,equilP,0);
	}

	@Test
	public void testGetArea() {
		double equilA = equilT.getArea();
		assertEquals(Math.sqrt(3),equilA,0);
	}

}
