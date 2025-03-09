
package login;
import java.util.*;

public class Login {


    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Please enter username: ");
        String user = kb.nextLine();
        
        System.out.print("Please enter password: ");
        String pass = kb.nextLine();
        
        if (user.equals("Rose") && pass.equals("Red")){
        System.out.println("Hello Rose, login successful");}
        
        else if (user.equals("Violet") && pass.equals("Blue")){
        System.out.println("Hello Violet, login successful");}
        
        else if (user.equals("Rose") && !pass.equals("Red")){
        System.out.println("Hello Rose, Access is suspended");}
        
        else if (user.equals("Violet") && !pass.equals("Blue")){
        System.out.println("Hello Violet, Access is suspended");}
        
        else
        System.out.println("Access is denied");
        
    }
    
}
