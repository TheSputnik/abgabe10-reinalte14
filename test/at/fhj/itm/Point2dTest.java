package at.fhj.itm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Point2dTest {
	

	
	/**
	 * Set some Point2d for testing their functionality
	 */

	/**
	 * Test the Setter of the x-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of x
	 */
	@Test
	public void testSetX(){
		
		double val = 4.5;
		Point2d pt = new Point2d();
		pt.setX(val);
		assertEquals(val, pt.getX(), 0.00001);
		
	}

	/**
	 * Test the Setter of the y-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of y
	 */
	@Test
	public void testSetY(){
		double val = 4.5;
		Point2d pt = new Point2d();
		pt.setY(val);
		assertEquals(val, pt.getY(), 0.00001);
	}
	

	/**
	 * Test the distanceFrom() Method
	 * - call the method distanceFrom and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFrom()
	 */
	@Test
	public void testDistanceFrom(){
	
	Point2d pt1 = new Point2d();
	Point2d pt2 = new Point2d(4,3);
	

	
	assertEquals(5.0, pt1.distanceFrom(pt2), 0.0000001);
	}

	/**
	 * Test the distanceFromOrigin() Method
	 * - call the method distanceFromOrigin and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFromOrigin()
	 */
	@Test
	public void testDistanceFromOrigin(){	

		Point2d pt1 = new Point2d(4,3);
	
		

		
		assertEquals(5.0, pt1.distanceFromOrigin(), 0.0000001);
		
		
	}
}
