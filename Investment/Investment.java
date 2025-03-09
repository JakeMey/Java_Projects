//Defines the package name for the Investment class
package investment;

//Imports all classes from the java.util package, including Scanner
import java.util.*;

//Declares the Investment class
public class Investment {

    //Main method where the program execution begin
    public static void main(String[] args) {

        //Creates a Scanner object for user input
        Scanner kb = new Scanner(System.in);

        //Initialises a counter for the while loop
        int counter = 0;

        //prompts user for investment information
        System.out.print("Enter amount to invest: ");
        double amount = kb.nextDouble();

        System.out.print("Enter interest rate: ");
        double rateInput = kb.nextDouble();
        //Converts percentage to decimal
        double rate = rateInput / 100.0;

        System.out.print("Enter number of years: ");
        double years = kb.nextDouble();

        //Variable to hold the calculated investment value
        double value;

        //Prints headings for the output table
        System.out.printf("%10s %10s %10s %10s \n", "Year", "Amount", "Interest %", "Value");

        //While loop runs until the counter reaches the number of years user inputs
        while (counter < years) {
            //Calculates the investment value for the current year
            value = amount * Math.pow((1 + rate), counter);

            //Prints the year, initial amount, interest rate, and calculated value
            System.out.printf("%10d %10.2f %10.2f %10.2f \n", counter + 1, amount, rate * 100, value);

            //increaase the counter by 1 for each loop iteration
            counter++;
        }
        //End of the main method
    }

//End of the Investment class    
}
