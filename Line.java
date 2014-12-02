package edu.cofc.csci221.ui;

/**
 * @author CSCI 221 - Programming Assignment 9
 * @since 10/7/14
 * This class will create a line
 */
public class Line {
	
	//instance variables
	private Point start = null;		//initialize start instance variable to null
	private Point end = null;		//initialize end instance variable to null
	
	//constructor method
	/**
	 * Line(Point start, Point end): A constructor method of the Line class that  will initialize the start and end point instances variables
	 * Precondition: start!=null and end!=null
	 * Postcondition: None
	 * @param start
	 * @param end
	 * @return void
	 */
	Line (Point start, Point end) {
		if (start != null && end != null) {
			this.start = start;		//initialize start point instance variable with the point object passed into the constructor
			this.end = end;			//initialize end point instance variable with the point object passed in the constructor
		}
		else {
			this.start = null;		//initialize start instance variable to null
			this.end = null;		//initialize end instance variable to null
		}
	}
	
	//get methods
	/**
	 * getStart(): A getter method of the Line class that gets the start point instance variable
	 * Precondition: None
	 * Postcondition: Returns the instance variable, start
	 * @param null
	 * @return start
	 */
	public Point getStart() {
		return start;		//return start point object
	}
	/**
	 * getEnd(): A getter method of the Line class that gets the end point instance variable
	 * Precondition: None
	 * Postcondition: Returns the instance variable, end
	 * @param null
	 * @return end
	 */
	public Point getEnd() {
		return end;			//return end point object
	}
	
	//set methods
	/**
	 * setStart(Point start): A setter method of the Line class that sets the start point instance variable
	 * Precondition: start!=null
	 * Postcondition: None
	 * @param start
	 * @return void
	 */
	public void setStart(Point start) {
		if (start != null) {
			this.start = start;		//set the start point instance variable
		}
	}
	/**
	 * setEnd(Point end): A setter method of the Line class that sets the end point instance variable
	 * Precondition: end!=null
	 * Postcondition: None
	 * @param end
	 * @return void
	 */
	public void setEnd(Point end) {
		if (end != null) {
			this.end = end;			//set the end point instance variable
		}
	}
	/**
	 * isValid(): A method of the Line class that evaluates if the start and end instance variables are valid
	 * Precondition: None
	 * Postcondition: Returns a boolean
	 * @param end
	 * @return 
	 * @return boolean
	 */
	public boolean isValid() {		//comparison method
		if (start != null && end!=null) {
			return true;		//returns true if start does not equal null and end does not equal null
		}
		else {
			return false;		//return false
		}
	}
	
	
	
	
	
}
