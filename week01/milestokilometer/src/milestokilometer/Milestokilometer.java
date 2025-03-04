/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package milestokilometer;

/**
 *
 * @author JakeMey
 */
public class Milestokilometer {

    public static void main(String[] args){

        double miles = 100;
        final double MILE_TO_KILOMETER =1.609;
        double kilometer = miles* MILE_TO_KILOMETER;
        System.out.println("Result is " + kilometer);

    }
    
}