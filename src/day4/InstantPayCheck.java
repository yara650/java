package day4;

import java.util.Scanner;

public class InstantPayCheck {
   static final double requiredSalary = 20000;
   static final double requiredCreditScore = 700;
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // What we have
       // double requiredSalary = 20000;
       // double requiredCreditScore = 700;
        // what we need to get
       //getEmployeeInfo();
       double salary= getEmployeeSalary();
        double creditScore =getEmployeeCreditScore();
       boolean qualified = isQualified(salary , creditScore);
        scanner.close();
        notifyUser (qualified);
    }
//    static double getEmployeeInfo(){
//        Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter your salary ");
//         double salary = scanner.nextDouble();
//         System.out.println("Enter your credit score ");
//         double creditScore = scanner.nextDouble();
//     }
    static double getEmployeeSalary() {
        System.out.println("Enter your salary ");
        double salary = scanner.nextDouble();
        return salary;
    }
    static double getEmployeeCreditScore() {
        System.out.println("Enter your credit score ");
        double creditScore = scanner.nextDouble();
        return creditScore;
    }
     static boolean isQualified(double salary , double creditScore) {
         if (salary > requiredSalary && creditScore > requiredCreditScore) {
             return true;
         } else {
             return false;
         }
         }
         static void notifyUser ( boolean qualified ){
             if (qualified) {
                 System.out.println("congratulation");
             } else {
                 System.out.println("sorry,you are not qualified");
             }
         }
     }
