package edu.cofc.csci221.ui;
/**
 * @author CSCI 221 - Programming Assignment 9
 * @since 12/1/14
 * 
 * This class inherits from the Line class. It will create a KochLine object from two points. Other methods in this class
 * are getLineA(), getLineB(), getLineC(), getLineD(), which return KochLIne objects. This class also contains a computeFractal() 
 * method which computes p2, p3, and p4 coordinate values and a isKochLineValid() method which evaluates if KochLine segments are
 * valid.
 *
 */
public class KochLine extends Line {
	
	//private instance variables
	private Point p1 = null;	//a point instance variable initialized to null
	private Point p2 = null;	//a point instance variable initialized to null
	private Point p3 = null;	//a point instance variable initialized to null
	private Point p4 = null;	//a point instance variable initialized to null
	private Point p5 = null;	//a point instance variable initialized to null
		
	/**
	 * KochLine(Point start, Point end): A public constructor that defines two parameters: start and end Point objects.
	 * Precondition: Requires start and end point objects as parameters
	 * Postcondition: None
	 * @param start, end
	 * @return void
	 */
	public KochLine(Point start, Point end) {
		super(start, end);	//call to the super constructor
		p1 = getStart();	//p1 is set to the start point argument
		p5 = getEnd();		//p5 is set to the end point argument
	}
	
	//public methods
	
	/**
	 * getLineA(): a public method that creates a new KochLine object with start point p1 and end point p2.
	 * Precondition: None
	 * Postcondition: Returns a KochLine object, k1
	 * @param null
	 * @return KochLine k1
	 */
	public KochLine getLineA() {
		 KochLine k1 = new KochLine(p1,p2);	//create a new KochLine object with p1 and p2
		 return k1;	//return the KochLine object
	}
	
	/**
	 * getLineB(): a public method that creates a new KochLine object with start point p2 and end point p3.
	 * Precondition: None
	 * Postcondition: Returns a KochLine object, k2
	 * @param null
	 * @return KochLine k2
	 */
	public KochLine getLineB() {
		 KochLine k2 = new KochLine(p2,p3);	//create a new KochLine object with p2 and p3
		 return k2;	//return the KochLine object
	}
	
	
	/**
	 * getLineC(): a public method that creates a new KochLine object with start point p3 and end point p4.
	 * Precondition: None
	 * Postcondition: Returns a KochLine object, k3
	 * @param null
	 * @return KochLine k3
	 */
	public KochLine getLineC() {
		 KochLine k3 = new KochLine(p3,p4);	//create a new KochLine object with p3 and p4
		 return k3;	//return the KochLine object
	}
	
	/**
	 * getLineD(): a public method that creates a new KochLine object with start point p4 and end point p5.
	 * Precondition: None
	 * Postcondition: Returns a KochLine object, k4
	 * @param null
	 * @return KochLine k4
	 */
	public KochLine getLineD() {
		 KochLine k4 = new KochLine(p4,p5);	//create a new KochLine object with p4 and p5
		 return k4;	//return the KochLine object
	}
	
	/**
	 * computeFractal(): a public method that computes p2,p3,and p4 (x,y) coordinate values using the equations in Fig 1.
	 * Precondition: None
	 * Postcondition: None
	 * @param null
	 * @return null
	 */
	public void computeFractal() {
		
		int changeInX = p5.getX() - p1.getX();	//this is x5 - x1
		int changeInY = p5.getY() - p1.getY();	//this is y5 - y1
		int x2 = p1.getX() + (changeInX/3);	//this is the x value for p2
		int y2 = p1.getY() + (changeInY/3);		//this is the y value for p2
		p2 = new Point (x2,y2);	//create a new point named p2 with x2 and y2
		int x3 = (int) (((p1.getX()+p5.getX())/2) + (Math.sqrt(3) * (p1.getY()-p5.getY()))/6);	//the x value for p3
		int y3 = (int) ((p1.getY()+p5.getY())/2 + Math.sqrt(3) * (p5.getX()-p1.getX())/6);	//the y value for p3
		p3 = new Point (x3,y3);	//create a new point named p3 with x3 and y3
		int x4 = p1.getX() + 2*changeInX/3;	//the x value for p4
		int y4 = p1.getY() + 2*changeInY/3;	//the y value for p4
		p4 = new Point (x4,y4);	//create a new point named p4 with x4 and y4
		
		//print statements to check the values for x2,y2,x3,y3,x4,y4
		System.out.println("x2 value: "+x2);
		System.out.println("y2 value: "+y2);
		System.out.println("x3 value: "+x3);
		System.out.println("y3 value: "+y3);
		System.out.println("x4 value: "+x4);
		System.out.println("y4 value: "+y4);
		
	}
	
	/**
	 * isKochLineValid(): a public method that evaluates if all the KochLine segments (A,B,C, and D) are valid.
	 * Precondition: None
	 * Postcondition: Returns a boolean. True if the line segment is valid and false if the line segment is not valid.
	 * @param null
	 * @return boolean
	 */
	public boolean isKochLineValid() {
		if (getLineA().isValid()) {
			System.out.println("KochLine segment A is valid");
			return true;	//return true if lineA is valid
		}
		if (getLineB().isValid()) {
			System.out.println("KochLine segment B is valid");
			return true;	//return true if lineB is valid
		}
		if (getLineC().isValid()) {
			System.out.println("KochLine segment C is valid");
			return true;	//return true if lineC is valid
		}
		if (getLineD().isValid()) {
			System.out.println("KochLine segment D is valid");
			return true;	//return true if lineD is valid
		}
		else {
			return false;	//return false if the line segment is not valid
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
