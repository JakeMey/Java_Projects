/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package outputcheck1;

/**
 *
 * @author JakeMey
 */
public class Outputcheck1 {

    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number < 20) {
            number++;
            if (number == 10 || number == 11) {
                break;
            }
            System.out.println("The number is " + number);
        }
    }
}
