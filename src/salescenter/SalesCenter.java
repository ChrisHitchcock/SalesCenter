/*
 * Name:        Chris Hitchcock
 * Date:        November 3, 2016
 * Version:     1.1
 * Description: Creates a sales center with managers and associates.
 */
package salescenter;

/**
 * A sales center with managers and associates.
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class SalesCenter {

    /**
     * Displays employee name and pay. pre: none post: Employee name and pay has
     * been displayed
     */
    public static void payEmployee(Employee emp, double payArg) {
        //Variable/object declaration
        NumberFormat money = NumberFormat.getCurrencyInstance();
        double pay;
        
        //Display name and pay
        System.out.println(emp);
        pay = emp.pay(payArg);
        System.out.println(money.format(pay));
    }

    public static void main(String[] args) {
        //Variable/Object declaration
        Manager emp1 = new Manager("Diego", "Martin", 55000);
        Associate emp2 = new Associate("Kylie", "Walter", 18.50);
        Associate emp3 = new Associate("Michael", "Rose", 16.75);
        Scanner input = new Scanner(System.in);
        String action;
        int empNum;
        double payArg;
        Employee emp = emp1; //Set emp (which gets changed based on choice) to emp1 by default

        //Until user presses Q, do this
        do {
            //Menu
            System.out.println("\nEmployee\\Pay\\Quit");
            System.out.print("Enter choice: ");
            action = input.next();

            //Unless user presses Q for quit, it prompts for employee number and sets it.
            if (!action.equalsIgnoreCase("Q")) {
                System.out.print("Enter employee number (1, 2, or 3):");
                empNum = input.nextInt();
                
                //Switch that changes which employee emp is set as
                switch (empNum) {
                    case 1:
                        emp = emp1;
                        break;
                    case 2:
                        emp = emp2;
                        break;
                    case 3:
                        emp = emp3;
                        break;
                }
                //Displays details of chosen employee if user inputs E
                if (action.equalsIgnoreCase("E")) {
                    System.out.println(emp);
                } else
                    //Displays the users pay based on inputted period of payment
                    if (action.equalsIgnoreCase("P")) {
                    System.out.print("Enter the hours for associate or pay period for manager: ");
                    payArg = input.nextDouble();
                    payEmployee(emp, payArg);
                }
            }
        } while (!action.equalsIgnoreCase("Q"));
    }
}
