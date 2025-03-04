/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxmin;

import java.util.*;
/**
 *
 * @author JakeMey
 */
public class MaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter Student 1 mark: ");
        int mark1 = kb.nextInt();
        System.out.print("Enter Student 2 mark: ");
        int mark2 = kb.nextInt();
        
        //Calculate max and min marks
        int markmax = Math.max(mark1, mark2);
        int markmin = Math.min(mark1, mark2);
        
        System.out.println("Maximum mark: " + markmax);
        System.out.println("Minimum mark: " + markmin);
    }
    
}
