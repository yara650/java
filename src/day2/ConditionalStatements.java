package day2;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        // Example 1
//        int age =18;
//        if(age>=18)
//            System.out.println("Eligible");
//        else
//            System.out.println("Not Eligible");

        // Example 2
//        Scanner scanner = new Scanner(System.in); // we open one scanner
//        System.out.println("Enter number to check");
//       int number= scanner.nextInt();
//       if(number%2==0){
//           System.out.println("even");
//
//       }
//       else{
//           System.out.println("odd");
//       }
//       scanner.close(); // B its unused object

        // Example 3

//       Scanner scanner = new Scanner(System.in);
//       System.out.println("Enter number to check");
//        int number = scanner.nextInt();
//      //  scanner.close(); can be here , bec we dont take another input from user
//        if(number>0)
//        System.out.println("Positive");

//else if(number<0)
//        System.out.println("Negative");
//
//else
//        System.out.println("Zero");
//
//        scanner.close();

        // Example 4
//        Scanner scanner = new Scanner (System.in);
//        System.out.println("Enter First number");
//        int num1 =scanner.nextInt();
//        System.out.println("Enter Second number");
//        int num2 =scanner.nextInt();
//        System.out.println("Enter Third number");
//        int num3 =scanner.nextInt();
//        scanner.close();  // can close it here
//        if(num1>num2&&num1>num3)
//        System.out.println("First Number is the largest");
//else if(num2>num1&&num2>num3)
//        System.out.println("Second Number is the largest");
//else
//        System.out.println("Third Number is the largest");

        //Example 5
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter day number");
        int dayNumber = scanner.nextInt();
//        if(dayNumber==1) {
//            System.out.println("Sunday");
//        }
//        else if(dayNumber==2) {
//            System.out.println("Monday");
//        }
//       else if(dayNumber==3) {
//            System.out.println("TUESday");
//        }
//        else if(dayNumber==4) {
//            System.out.println("Wednesday");
//        }
//        else if(dayNumber==5) {
//            System.out.println("Thursday");
//        }
//        else if(dayNumber==6) {
//            System.out.println("Friday");
//        }
//        else if(dayNumber==7) {
//            System.out.println("Satday");
//        }
//        else {
//            System.out.println("Invalid Day Number");
        //  }

        // OR
        switch (dayNumber){     //  So Fast
            case 1: System.out.println("Sunday");break; // break for not print all days
            case 2: System.out.println("Monday");break;
            case 3: System.out.println("Tuesday");break;
            case 4: System.out.println("Wednesday");break;
            case 5: System.out.println("Thursday");break;
            case 6: System.out.println("Friday");break;
            case 7: System.out.println("Saturday");break;
            default: System.out.println("Invalid Number"); // full back case
        }
        scanner.close();
    }
}

