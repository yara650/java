package day2;

import java.util.Scanner;

public class LoopStatementsEmployeeGrossPay {
    public static void main(String[] args) {
        // What we have
        int rate = 15;
        int maxhoursperweek = 40;
        // What we need
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your working hours");
        int workedhours = scanner.nextInt();
        while (workedhours > maxhoursperweek) {
            System.out.println("Please Enter Number between 1and40");
            workedhours = scanner.nextInt();

        }
        int grosspay = workedhours*rate;
        System.out.println("your gross salary is "+grosspay+" $");
        scanner.close();
    }
}
