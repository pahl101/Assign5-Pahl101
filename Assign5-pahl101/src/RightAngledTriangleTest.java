import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author MadisonPahl
 *
 */
public class RightAngledTriangleTest {
	
	double w;
	double h;
	double hyp;
	
	RightAngledTriangle right;

	/**
	 * @throws java.lang.Exception
	 * throws exception to ensure it works
	 */
	@Before
	public void setUp() throws Exception {
		w = 3;
		h = 4;
		hyp = 5;
		right = new RightAngledTriangle(w,h,hyp);
		
	}
	@Test
	public void testEquilateralTriangle() throws Exception {

	}

	@Test
	public void testValidateInput() {
		assertTrue(right.validateInput(w,h,hyp));
		hyp = 1;
		assertFalse(right.validateInput(w, h, hyp));
		
	}


	@Test
	public void testGetPerimeter() {
		double rightP = right.getPerimeter();
		assertEquals(12,rightP,0);

	}

	@Test
	public void testGetArea() {
		double rightA = right.getArea();
		assertEquals(6,rightA,0);
	
	}

}
