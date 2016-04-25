import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {
	
	double a;
	double b;
	double c;


	Triangle t;
	//Triangle t2;

	@Before
	public void setUp() throws Exception {
		a=3;
		b=4;
		c=5;
		t = new Triangle(a,b,c);
		//t2 = new Triangle(a,b,c);

		

	}

	@Test
	public void testTriangle() throws Exception {
		
		

	}

	@Test
	public void testValidateInput() throws Exception{
		assertTrue(t.validateInput(a, b, c));
		assertTrue(t.validateInput(a, c, b));
		assertTrue(t.validateInput(b, a, c));
		assertTrue(t.validateInput(b, c, a));
		assertTrue(t.validateInput(c, a, b));
		assertTrue(t.validateInput(c, b, a));
	}

	
	@Test (expected = Exception.class) public void failAttempt() throws Exception{
			a=0;
			b=0;
			c=0;
			Triangle t2;
			t2 = new Triangle(a,b,c);
		    t2.validateInput(0,0,0);
		    }

	
	@Test
	public void testGetSideA() {
		assertEquals(3,t.getSideA(),0);
		
	}

	@Test
	public void testGetSideB() {
		assertEquals(4,t.getSideB(),0);
	}

	@Test
	public void testGetSideC() {
		assertEquals(5,t.getSideC(),0);
	}

	@Test
	public void testGetPerimeter() {
		
		double p = t.getPerimeter();
		assertEquals(12,p,0);
	}

	@Test
	public void testGetArea() {
		double area = t.getArea();
		assertEquals(6,area,0);
	}

}
