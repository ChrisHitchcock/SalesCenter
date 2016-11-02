/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salescenter;
/**
 * Employee class.
 */
abstract class Employee {
	String firstName, lastName;

	/**
	 * constructor
	 * pre: none
	 * post: An employee has been created.
	 */
	public Employee(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	
		
	/** 
	 * Returns the employee name.
	 * pre: none
	 * post: The employee name has been returned.
	 */
	public String toString() {
		return(firstName + " " + lastName);
	}
	
	
	/** 
	 * Returns the employee pay.
	 * pre: none
	 * post: The employee pay has been returned.
	 */
	abstract double pay(double period, double hrs);
}
