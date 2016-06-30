package at.fhj.itm;
class Point2d {
	private boolean debug;
	
	double x;
	double y; 

	public Point2d (double px, double py)
	{ 
		x = px;
		y = py;
	}

	public Point2d () 
	{		
		// just create a point of 0/0 
		x = 0;
		y = 0;
	}

	public Point2d (Point2d pt) 
	{	
		x= pt.getX();
		y= pt.getY();
		
	}

	public void dprint (String s) {
		if (debug)
			System.out.println("Debug: " + s);
	}

	public void setDebug (boolean b) {
		 this.debug = b;
	}

	public void setX(double px) {
		x = px;
		dprint ("setX(): Changing value of X from " + x + " to " + px );
	}

	public double getX() {
		return x;
	}

	public void setY(double py)  {
		y = py;
		dprint ("setY(): Changing value of Y from " + y + " to " + py );
	}

	public double getY() {
		return y;
	}

	public void setXY(double px, double py) {
	}

	public double distanceFrom (Point2d pt) {
		
		double tempx = pt.getX() ;
		double tempy = pt.getY();
		double a= x - tempx;
		double b= y - tempy;
		
		
		
	return Math.sqrt((a*a)+(b*b));
	}

	public double distanceFromOrigin () {
		
		return this.distanceFrom(new Point2d());
	}

	public String toString() {
		String string = "x: "+ x + " y: "+ y;
		
		return string;
		
	}
}

