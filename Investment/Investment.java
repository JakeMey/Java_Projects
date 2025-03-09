package investment;

import java.util.*;

public class Investment {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
        //Create counter for while loop
        int counter = 0;
        
        //prompt user for investment information
        System.out.print("Enter amount to invest: ");
        double amount = kb.nextDouble();
        
        System.out.print("Enter interest rate: ");
        double rateInput = kb.nextDouble();
        double rate = rateInput / 100.0;
        
        System.out.print("Enter number of years: ");
        double years = kb.nextDouble();
        
        double value;
        
        //headings for output
        System.out.printf("%10s %10s %10s %10s \n", "Year", "Amount", "Interest %", "Value");
        
        //while loop runs until the counter reaches the number of years user inputs
        while (counter < years) {
            //increase years by 1 for each loop
            value = amount * Math.pow((1 + rate), counter);
            
            System.out.printf("%10d %10.2f %10.2f %10.2f \n", counter + 1, amount, rate * 100, value);
            //increaase the counter by 1 for each loop
            counter++;}
    
    }
        
    
}
