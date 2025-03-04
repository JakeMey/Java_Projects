/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package add;

import java.util.*;

/**
 *
 * @author JakeMey
 */
public class Add {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter 1st number: ");
        int n1 = kb.nextInt();
        
        System.out.print("Enter 2nd number: ");
        int n2 = kb.nextInt();
        
        int result = n1 + n2;
        
        System.out.print("1st number is " + n1);
        System.out.print(" 2nd number is " + n2);
        System.out.print(" total of " + n1);
        System.out.print("+" + n2);
        System.out.println("=" + result);
        
        
    }
    
}
