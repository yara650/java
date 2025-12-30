package day4;

import java.util.Scanner;

public class GreetUser {
    static Scanner scanner = new  Scanner(System.in);
    public static void main(String[] args) {
      String name =  getUserName();
       greetUser(name);
       scanner.close();

    }

  static String getUserName(){ // doesnt have parameter list
      // Scanner scanner = new Scanner(System.in);
       System.out.println("Enter you name ");
       String name = scanner.nextLine();
     //  greetUser(name); wrong
      return name;
  }
   static void greetUser(String name){  // has parameter list
       System.out.println("Hello "+name );
   }
}
