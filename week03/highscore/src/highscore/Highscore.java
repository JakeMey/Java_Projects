/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package highscore;

import java.util.Scanner;

public class Highscore {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        // Prompt user for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = kb.nextInt();
        kb.nextLine();

        String highestScoringStudent = "";
        double highestScore = Double.NEGATIVE_INFINITY;

        // Loop through each student
        for (int i = 0; i < numberOfStudents; i++) {
            // Prompt for student name
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String studentName = kb.nextLine();

            // Prompt for student score
            System.out.print("Enter the score of " + studentName + ": ");
            double studentScore = kb.nextDouble();
            kb.nextLine(); // Consume the newline character

            // Check if the current student's score is higher than the highest score
            if (studentScore > highestScore) {
                highestScore = studentScore;
                highestScoringStudent = studentName;
            }
        }

        // Show the student with the highest score
        System.out.println("The student with the highest score is: " + highestScoringStudent + " with a score of " + highestScore);
    }
}
