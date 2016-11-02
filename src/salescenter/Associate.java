/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salescenter;
/**
 * Associate class.
 */
class Associate extends Employee {
	double hourlyPayRate;

	/**
	 * constructor
	 * pre: none
	 * post: An associate has been created.
	 */
	public Associate(String fName, String lName, double rate) {
		super(fName, lName);
		hourlyPayRate = rate;
	}
	
		
	/** 
	 * Returns the associate pay rate.
	 * pre: none
	 * post: The associate pay rate has been returned.
	 */
	public double getRate() {
		return(hourlyPayRate);
	}


	/** 
	 * Returns the associate pay for the hours worked.
	 * pre: none
	 * post: The associate pay for the hours worked has been returned.
	 */
        
        public double pay(double weeks, double hrs) {
		double payEarned = 0;
		if (hrs<=40)
                {
                    payEarned = (hourlyPayRate*hrs) * weeks;
                }
                else if (hrs>40)
                {
                    double otHours = hrs-40;
                    payEarned = (((hourlyPayRate*40)+((hourlyPayRate*1.5)*otHours))*weeks);
                }
		return(payEarned);
	}
	
	
	
	/** 
	 * Returns the employee name and title.
	 * pre: none
	 * post: The employee name and title has been returned.
	 */
	public String toString() {
		return(super.toString() + ", associate");
	}	
}

