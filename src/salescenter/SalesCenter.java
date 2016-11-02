/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salescenter;

/**
  * A sales center with managers and associates.
  */
 
 import java.util.Scanner;
 import java.text.NumberFormat;
  
 public class SalesCenter {
 	
 	/**
 	 * Displays employee name and pay.
 	 * pre: none
 	 * post: Employee name and pay has been displayed
 	 */
 	public static void payEmployee(Employee emp, double payArg, double hrs) {
 		NumberFormat money = NumberFormat.getCurrencyInstance();
 		double pay;
 		
 		System.out.println(emp);
 		pay = emp.pay(payArg, hrs);
 		System.out.println(money.format(pay));	
 	}


	public static void main(String[] args) {
		Manager emp1 = new Manager("Diego","Martin", 55000);
		Associate emp2 = new Associate("Kylie", "Walter", 18.50);
		Associate emp3 = new Associate("Michael", "Rose", 16.75);
		Scanner input = new Scanner(System.in);
		String action;
		int empNum;
		double payArg;
		Employee emp = emp1;	//set to default emp1
				
		/* display menu of choices */
		do {
			System.out.println("\nEmployee\\Pay\\Quit");
			System.out.print("Enter choice: ");
			action = input.next();
			
			if (!action.equalsIgnoreCase("Q")) {
				System.out.print("Enter employee number (1, 2, or 3):");
				empNum = input.nextInt();
				switch (empNum) {
					case 1: emp = emp1; break;
					case 2: emp = emp2; break;
					case 3: emp = emp3; break;
				}
				if (action.equalsIgnoreCase("E")) {
					System.out.println(emp);
				} else if (action.equalsIgnoreCase("P")) {
					System.out.print("Enter the amount of weeks worked: ");
					payArg = input.nextDouble();
                                        if (emp==Associate)
                                        {
                                            System.out.print("Enter the hours worked: ");
                                            double hours = input.nextDouble();
                                            payEmployee(emp, payArg, hours);
                                        } else {
                                            payEmployee(emp, payArg, 40);
                                        }
                                        
				}
			}
		} while (!action.equalsIgnoreCase("Q"));
	}
}