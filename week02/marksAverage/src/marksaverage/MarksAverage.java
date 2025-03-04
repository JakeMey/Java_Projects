/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marksaverage;
import java.util.*;
/**
 *
 * @author JakeMey
 */
public class MarksAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter marks for course 1: ");
        double c1 = kb.nextDouble();
        
        System.out.print("Enter marks for course 2: ");
        double c2 = kb.nextDouble();
        
        System.out.print("Enter marks for course 3: ");
        double c3 = kb.nextDouble();
        
        double result = (c1 + c2 + c3) / 3;
        
        System.out.print("Marks in course 1  " + c1);
        System.out.print(" Marks in course 2  " + c2);
        System.out.print(" Marks in course 3  " + c3);
        System.out.println("  Average calculated : " + result);
                
    }
    
}
