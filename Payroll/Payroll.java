//Defines the package name for the Payroll class
package payroll;

//Imports all classes from the java.util package, including Scanner
import java.util.*;

//Declares the Payroll class
public class Payroll {

    //Main method where the program execution begin
    public static void main(String[] args) {
        //Creates a Scanner object to read user inpu
        Scanner kb = new Scanner(System.in);

        //Prompts the user to enter the employee's name
        System.out.print("Enter employee's name: ");
        //Reads the employee's name
        String name = kb.nextLine();

        //Prompts the user to enter the number of hours worked
        System.out.print("Enter number of hours worked in week: ");
        //Reads the number of hours worked
        int hours = kb.nextInt();

        //Prompts the user to enter the hourly pay rate
        System.out.print("Enter hourly pay rate: ");
        //Reads the hourly pay rate
        double rate = kb.nextDouble();

        //Prompts for the federal tax withholding rate as a decimal
        System.out.print("Enter Federal tax withholding rate as decimal: ");
        // Reads the federal tax rate
        double ftax = kb.nextDouble();

        //Prompts for the state tax withholding rate as a decimal
        System.out.print("Enter State tax withholding rate as decimal: ");
        //Reads the state tax rate
        double stax = kb.nextDouble();

        //Calculates the gross pay
        double gross = hours * rate; // Gross pay is hours worked multiplied by pay rate

        //Federal tax rate converted to percentage for display
        double ftaxperc = ftax * 100;
        //Converts federal tax rate to percentage
        String formattedftaxperc = String.format("%.2f%%", ftaxperc); //Formats the federal tax percentage

        //State tax rate converted to percentage for display
        double staxperc = stax * 100;
        //Converts state tax rate to percentage
        String formattedstaxperc = String.format("%.2f%%", staxperc); //Formats the state tax percentage

        //Calculates the actual tax values
        double ftaxvalue = gross * ftax; //Calculates the federal tax amount
        double staxvalue = gross * stax; //Calculates the state tax amount

        //Total tax is the sum of federal and state tax values
        double tax = ftaxvalue + staxvalue;

        //Calculates the total pay after deducting taxes
        double totalpay = gross - tax; // Net pay is gross pay minus total tax

        //Outputs the results
        System.out.println("");
        System.out.println("Employee's name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Payrate: " + rate);
        System.out.println("Gross Pay: " + gross);

        //Header for deductions
        System.out.println("Deductions:");

        System.out.print("Federal Withholding: ");
        //Prints the formatted federal tax percentage
        System.out.print(formattedftaxperc);
        //Prints the federal tax amount
        System.out.println(" $" + ftaxvalue);

        System.out.print("State Withholding: ");
        //Prints the formatted state tax percentage
        System.out.print(formattedstaxperc);
        //Prints the state tax amount
        System.out.println(" $" + staxvalue);

        //Displays the net pay
        System.out.println("Net Pay: $" + totalpay);
        //End of the main method
    }

//End of the Payroll class
}
