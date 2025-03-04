/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movie;

import java.util.*;

/**
 *
 * @author JakeMey
 */
public class Movie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = kb.nextLine();

        System.out.print("Please enter your mobile number: ");
        String mobile = kb.nextLine();

        System.out.print("Please enter your age: ");
        int age = kb.nextInt();
        
        int result;

        if(age <= 18){result = 10;}
        else if(age >= 18 && age <= 65) {result = 20;}
        else result = 15;
    
        System.out.println("Name " + name);
        System.out.println("Mobile Number " + mobile);
        System.out.println("Age " + age);
        System.out.println ("Movie ticket price is $" + result);
        
    }
    
}
