/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whilemarks;

import java.util.*;

public class Whilemarks {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0, numOfStudents = 5, mark = 0, sum = 0;
        while (count < numOfStudents) {
            System.out.println("Enter mark for student " + (count + 1));
            mark = scan.nextInt();
            if (mark == -1){
                break;
            }
            sum += mark; // accumulate total
            count++;
        }
        System.out.println("The average is: " + (double) sum / numOfStudents);
    }
}

    