/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectanglearea;

import java.util.*;

/**
 *
 * @author JakeMey
 */
public class RectangleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while (true) {

            System.out.print("Enter Length of Side 1: ");
            int side1 = kb.nextInt();

            System.out.print("Enter Length of Side 2: ");
            int side2 = kb.nextInt();

            if (side1 != side2) {
                int result = side1 * side2;
                System.out.println("Rectangle Area = " + result);
                break;
            } else {
                System.out.println("Sides must not be equal. Please try again.");
            }
        }
    }
}

        
