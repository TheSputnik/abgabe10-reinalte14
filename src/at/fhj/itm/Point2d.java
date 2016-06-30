package at.fhj.itm;
class Point2d {
	private boolean debug;
	
	double x;
	double y; 

	/**
	 * Constructor for Point x and y
	 * @param px
	 * @param py
	 */
	public Point2d (double px, double py)	
	{ 
		x = px;
		y = py;
	}

	/**
	 * just create a point of 0/0 
	 */
	public Point2d () 
	{		
		
		x = 0;
		y = 0;
	}
	/**
	 * Constructor for Point with data from Point pt 
	 * @param pt
	 */
	public Point2d (Point2d pt) 
	{	
		x= pt.getX();
		y= pt.getY();
		
	}
	/**
	 * Give request when debug is active
	 * @param s
	 */
	public void dprint (String s) {
		if (debug)
			System.out.println("Debug: " + s);
	}

	/**
	 * Set debug on/off
	 * @param b
	 */
	public void setDebug (boolean b) {
		 this.debug = b;
	}
	/**
	 * Setter for x
	 * @param px
	 */
	public void setX(double px) {
		x = px;
		dprint ("setX(): Changing value of X from " + x + " to " + px );
	}
	/**
	 * Getter for x
	 * @return x
	 */
	public double getX() {
		return x;
	}
	/**
	 * Setter for y
	 * @param py
	 */
	public void setY(double py)  {
		y = py;
		dprint ("setY(): Changing value of Y from " + y + " to " + py );
	}

	/**
	 * Getter for y
	 * @return y
	 */
	public double getY() {
		return y;
	}

	/**
	 * Setter for X and Y
	 * @param px
	 * @param py
	 */
	public void setXY(double px, double py) {
	}

	/**
	 * Calculates distance from pt to current point 
	 * @param pt
	 * @return distance
	 */
	public double distanceFrom (Point2d pt) {
		
		double tempx = pt.getX() ;
		double tempy = pt.getY();
		double a= x - tempx;
		double b= y - tempy;
		
		
		
	return Math.sqrt((a*a)+(b*b));
	}

	/**
	 * Calculates distance from 0/0 to current point
	 * @return
	 */
	public double distanceFromOrigin () {
		
		return this.distanceFrom(new Point2d());
	}
	
	public String toString() {
		String string = "x: "+ x + " y: "+ y;
		
		return string;
		
	}
}

