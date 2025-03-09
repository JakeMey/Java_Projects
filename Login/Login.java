//Defines the package name for the Login class
package login;

//Imports all classes from the java.util package, including Scanner
import java.util.*;

//Declares the Login class
public class Login {

    //Main method where the program execution begins     
    public static void main(String[] args) {

        //Creates a Scanner object to read user input
        Scanner kb = new Scanner(System.in);

        //Prompts the user for their username
        System.out.print("Please enter username: ");
        //Reads the username input
        String user = kb.nextLine();

        //Prompts the user for their password
        System.out.print("Please enter password: ");
        //Reads the password input
        String pass = kb.nextLine();

        //Checks if the username and password match the first valid credentials
        if (user.equals("Rose") && pass.equals("Red")) {
            //Successful login message for Rose
            System.out.println("Hello Rose, login successful");
        } //Checks if the username and password match the second valid credentials
        else if (user.equals("Violet") && pass.equals("Blue")) {
            //Successful login message for Violet
            System.out.println("Hello Violet, login successful");
        } //Checks if the username is Rose but the password is incorrect
        else if (user.equals("Rose") && !pass.equals("Red")) {
            //Access suspended message for Rose
            System.out.println("Hello Rose, Access is suspended");
        } //Checks if the username is Violet but the password is incorrect
        else if (user.equals("Violet") && !pass.equals("Blue")) {
            // Access suspended message for Violet
            System.out.println("Hello Violet, Access is suspended");
        } //If the username and password do not match any valid credentials
        else //Denied access message
        {
            System.out.println("Access is denied");
        }

        //End of the main method
    }

//End of the Login class    
}
