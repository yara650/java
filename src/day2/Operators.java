package day2;

public class Operators {
    public static void main(String[] args) {
        // Arithmetic +  - * / %
      //  int a=20 , b=10;
      //  System.out.println("The sum of a and b is "+a+b); wrong
//        System.out.println("The sum of a and b is "+(a+b));
//        System.out.println("The substraction of a and b is "+(a-b));
//        System.out.println("The multi of a and b is "+(a*b));
//        System.out.println("The division of a and b is "+(a/b));
//        System.out.println("The Ramainder of a and b is "+(a%b));

        // Relational/ comparison > >= <= == !=
//        System.out.println(a>b); // true
//        System.out.println(a<b); // false
//        System.out.println(a>=b); // true
//        System.out.println(a<=b); // false
//        System.out.println(a==b); // false
//        System.out.println(a!=b); // true

        // Logical && and , || or ,!
//        boolean x = true , y= false;
//        System.out.println(x&&y); // false
//        System.out.println(x||y); // true
//        System.out.println(!x);  // false
//        System.out.println(!y);  //true
        
    // Increment & Decrement ++  --
      // ** THIS COMPILER READ FROM LEFT TOB WRITE**
//        int a =10;
//        int b = a++;
//        System.out.println(a); // 11
//        System.out.println(b); // 10
//
//        b=++a;
//        System.out.println(a); // 12
//        System.out.println(b); // 12
//        System.out.println(b++); // 12
//        System.out.println(b++); // 13
//        System.out.println(b); // 14
//        System.out.println(++b); // 15
//        System.out.println(--b); // 14

//        int a =10;
//        a++;
//       int b = a++;
//       System.out.println(a); // 12
//        System.out.println(b); // 11

        // Assignment = += -= *= /= %= assign value
//        int a= 10;
//        int b = a;
//        a+=10; // a= a+10 // 20
//        a-=10; // a= a+10 // 10
//        a*=10; // a= a+10 // 100
//        a/=10; // a= a+10 // 10
//        a%=10; // a= a+10 // 0
//        System.out.println(a);

        // Conditional/ ternary  ?:
        // variable = exp ? true : false // means if/else
//        int a = 20 , b = 10;
//        int c = a>b ? a : b;
//        System.out.println(c); // 20

//        int a = 20 , b = 30;
//        int c = a>b ? a : b;
//        System.out.println(c);

        int age = 19;
        String vote = age>18?"Eligible":"Not Eligible";
        System.out.println(vote);

        }

    }
