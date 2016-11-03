/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salescenter;
/**
  * A sales center with managers and associates.
  */
 /**
 * Manager class.
 */
class Manager extends Employee {
	double yearlySalary;

	/**
	 * constructor
	 * pre: none
	 * post: A manager has been created.
	 */
	public Manager(String fName, String lName, double sal) {
		super(fName, lName);
		yearlySalary = sal;
	}
	
		
	/**
	 * Returns the manager salary.
	 * pre: none
	 * post: The manager salary has been returned.
	 */
	public double getSalary() {
		return(yearlySalary);
	}


	/**
	 * Returns the manager pay for a specified period.
	 * pre: none
	 * post: The manager pay for the specified period 
	 * has been returned.
	 */
	public double pay(double weeks) {
		double payEarned;
		
		payEarned = (yearlySalary / 52) * weeks;
		return(payEarned);
	}
	
	
	/** 
	 * Returns the employee name and title.
	 * pre: none
	 * post: The employee name and title has been returned.
	 */
	public String toString() {
		return(super.toString() + ", manager");
	}
}