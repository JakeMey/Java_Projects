/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fees;
import java.util.*;

/**
 *
 * @author JakeMey
 * 
 */
public class Fees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter number of hours enrolled: ");
        int hours = kb.nextInt();
        
        System.out.print("Enter amount spent on books: $");
        int books = kb.nextInt();
        
        int athfees = 65;
        int result = hours*85 + books + athfees;
        
        System.out.print("Hours enrolled " + hours);
        System.out.print(" Amount spent on books $" + books);
        System.out.print(" Athletic fees $65 ");
        System.out.println("Total amount is $" + result);
        
        
    
    }
    
}
