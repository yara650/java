package day3;

import java.util.Scanner;

// nested loop
public class StudentAverageScore {
    public static void main(String[] args) {
        // What we have
        int numberOfStudents = 3;
        int numberOfCourses = 4;
        Scanner scanner = new Scanner(System.in);
        // What we need
        //  double total =0;  the total for all students
        for (int i = 0; i < numberOfStudents; i++) {
            double total = 0; //  the total for each student
            for (int j = 0; j < numberOfCourses; j++) {
                System.out.println("Please enter score for course " + (j + 1)
                        + " for student " + (i + 1));
                double score = scanner.nextDouble();
                total += score;
            }
            // operations
            double avg = total / numberOfCourses;
            System.out.println("The average score of student " + (i + 1) + " is " + avg);
        }

        scanner.close();
    }
}
