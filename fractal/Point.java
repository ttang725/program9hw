package edu.cofc.csci221.ui;
/**
 * @author CSCI 221 - Programming Assignment 9
 * @since 10/7/14
 * This class will create a point
 */
public class Point {
	
	private int x;		//instance variable x
	private int y;		//instance variable y
	private Point p;	//instance object p 

	//constructor methods
	/**
	 * Point: A constructor method of Point that will initializes the x and y instance variables to 0
	 * Precondition: None
	 * Postcondition: None
	 * @param null
	 * @return void
	 */
	public Point() {	//no argument constructor
		x = 0;		//initialize x to 0
		y = 0;		//initialize y to 0
	}
	/**
	 * Point(Point point): A constructor method of the Point class that asks for a parameter point
	 * Precondition: point != null, x>=0 and x<= GridConstants.MAX_PANEL_WIDTH, y>=0 and y<= GridConstants.MAX_PANEL_HEIGHT
	 * Postcondition: None
	 * @param point
	 * @param x 
	 * @param  
	 * @return void
	 */
	public Point(Point point) {			//overloaded constructor
		if (point!= null) {
			if (x>=0 && x<= GridConstants.MAX_PANEL_WIDTH) {
				point.x = x;			//uses point object's x instance variable value to initialize the new point object's x instance variable value
			}
			else {
				point.x = 0;			//sets x instance variable to 0
			}
			if (y>=0 && y<= GridConstants.MAX_PANEL_HEIGHT) {
				point.y = y;			//uses point object's y instance variable value to initialize the new point object's y instance variable value
			}
			else {
				point.y = 0;			//sets y instance variable to 0
			}
		}
	}
	/**Point(int x, int y): A constructor method of the Point class
	 * Precondition: x>=0 and x<= GridConstants.MAX_PANEL_WIDTH, y>=0 and y <= GridConstants.MAX_PANEL_HEIGHT
	 * Postcondition:
	 * @param x, y
	 * @return void
	 */
	public Point(int x, int y) {		//overloaded constructor
		if (x>=0 && x<= GridConstants.MAX_PANEL_WIDTH) {
			this.x = x;					//set x instance variable to value in parameter
		}
		else {
			this.x = 0;					//set x instance variable to 0
		}
		if (y>=0 && y<= GridConstants.MAX_PANEL_HEIGHT) {
			this.y = y;					//set y instance variable to value in parameter
		}
		else {
			this.y = 0;					//set y instance variable to 0
		}	
	}
	
	//get methods
	/**getX(): A getter method for Point that gets the x coordinate instance variable
	 * Precondition: None
	 * Postcondition: Returns an instance variable, x
	 * @param null
	 * @return x
	 */
	public int getX() {
		return x;			//get the value of x and return it	
	}
	/**getY(): A getter method for Point that gets the y coordinate instance variable
	 * Precondition: None
	 * Postcondition: Returns an instance variable, y
	 * @param null
	 * @return y
	 */
	public int getY() {
		return y;			//get the value of y and return it
	}
	/**getPoint(Point p): A getter method of Point that gets an existing point object
	 * Precondition: None
	 * Postcondition: Returns a point object, p
	 * @param null
	 * @return p
	 */
	public Point getPoint() {
		return p;			//return a point object
	}
	//set methods
	/**setX(int x): A setter method of Point that sets the x coordinate value
	 * Precondition: x>=0 and x<= GridConstants.MAX_PANEL_WIDTH
	 * Postcondition: None
	 * @param x
	 * @return void
	 */
	public void setX(int x) {
		if (x>=0 && x<= GridConstants.MAX_PANEL_WIDTH) {
			this.x = x;		//set x instance variable to value in parameter
		}
		else {
			this.x = 0;		//set x instance variable to 0
		}
	}
	/**setY(int y): A setter method of Point that sets the y coordinate value
	 * Precondition: y>=0 and y<= GridConstants.MAX_PANEL_HEIGHT
	 * Postcondition: None
	 * @param y
	 * @return void
	 */
	public void setY(int y) {
		if (y>=0 && y<= GridConstants.MAX_PANEL_HEIGHT) {
			this.y = y;		//set y instance variable to value in parameter
		}
		else {
			this.y = 0;		//set y instance variable to 0
		}
	}
	/**setPoint(Point p): A setter method of Point that sets to an existing point object
	 * Precondition: p!= null, p == null, x and y values must also meet preconditions in setX() and setY() methods
	 * Postcondition: None
	 * @param p
	 * @return void
	 */
	public void setPoint(Point p) {
		if (p!=null) {
			this.p = p;		//set p to an existing point object
		}
		
	}
	
	
	
	
	
	
	
	
	
}
