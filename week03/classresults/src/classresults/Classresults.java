/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classresults;

import java.util.*;

/**
 *
 * @author JakeMey
 */
public class Classresults {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                Scanner kb = new Scanner(System.in);

        System.out.print("Please enter student's Class Results: ");
        int result = kb.nextInt();

        if(result >= 80)
        {System.out.println("Student Result: HD");}
        else if(result >= 70 && result <= 79)
        {System.out.println("Student Result: DI");}
        else if(result >= 60 && result <= 69)
        {System.out.println("Student Result: CR");}
        else if(result >= 50 && result <= 59)
        {System.out.println("Student Result: Pass");}
        else 
        {System.out.println("Student Result: Failure");}
    }
    
}
