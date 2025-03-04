/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperature;
import java.util.*;
/**
 *
 * @author JakeMey
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Input the expected temperature: ");
        int temp = kb.nextInt();
        
        switch (temp) {
            case 20:
                System.out.println("I will wear a t-shirt");
                break;
            case 15:
                System.out.println("I will wear long sleeves");
                break;
            case 10:
                System.out.println("I will wear a jumper");
                break;
            case 5:
                System.out.println("I am staying in bed!");
                break;
            default:
                System.out.println("No specific outfit for this temperature. ");
        }
        
    }
    
}
