
package payroll;


import java.util.*;


public class Payroll {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = kb.nextLine();

        System.out.print("Enter number of hours worked in week: ");
        int hours = kb.nextInt();

        System.out.print("Enter hourly pay rate: ");
        double rate = kb.nextDouble();

        System.out.print("Enter Federal tax withholding rate as decimal: ");
        double ftax = kb.nextDouble();

        System.out.print("Enter State tax withholding rate as decimal: ");
        double stax = kb.nextDouble();

        double gross = hours * rate;

        //Federal tax rate converted to percentage
        double ftaxperc = ftax * 100;
        String formattedftaxperc = String.format("%.2f%%", ftaxperc);

        //State tax rate converted to percentage
        double staxperc = stax * 100;
        String formattedstaxperc = String.format("%.2f%%", staxperc);

        double ftaxvalue = gross * ftax;
        double staxvalue = gross * stax;

        double tax = ftaxvalue + staxvalue;

        double totalpay = gross - tax;

        System.out.println("");
        System.out.println("Employee's name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Payrate: " + rate);
        System.out.println("Gross Pay: " + gross);

        System.out.println("Deductions:");

        System.out.print("Federal Withholding: ");
        System.out.print(formattedftaxperc);
        System.out.println(" $" + ftaxvalue);

        System.out.print("State Withholding: ");
        System.out.print(formattedstaxperc);
        System.out.println(" $" + staxvalue);

        System.out.println("Net Pay: $" + totalpay);

    }

}