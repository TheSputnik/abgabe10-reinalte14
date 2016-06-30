package at.fhj.itm;

public class cmdPoint2d {

	public static void main(String[] args) {
        if(args.length != 4){
            System.out.println("usage <double p1 x-coord> <double p1 y-coord> <double p2 x-coord> <double p2 y-coord>\n");
            return;
        }
        
        double pt1X = Double.parseDouble(args[0]);
        double pt1Y = Double.parseDouble(args[1]);
        double pt2X = Double.parseDouble(args[2]);
        double pt2Y = Double.parseDouble(args[3]);
        
        
        Point2d pt1 = new Point2d(pt1X, pt1Y);
        Point2d pt2 = new Point2d(pt2X, pt2Y);
        
        System.out.println(pt1.distanceFrom(pt2));
    

	}

}
