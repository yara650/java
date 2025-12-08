package day1;

public class DataTypes {
    public static void main(String[] args) {
        byte by = 127;
        System.out.println("value is" + by);

        short sh = 32767;
        System.out.println("value is" + sh);

        int i = 21212;
        System.out.println("value is" + i);

        long l = 2726266727L; // must use l
        System.out.println("value is" + l);

        float fl = 282.525552f; // must use f
        System.out.println("value is" + fl);

        double dbl = 256.25555855555;
        System.out.println("value is" + dbl);

        boolean bl = true;
        System.out.println("value is" + bl);

        char ch = 'A'; // must '',
        System.out.println("value is" + ch);

        String name = "Ahmed"; // must "" , can use A
        System.out.println("value is " + name);
    }
    }

/* 1 widing / up casting
int i =21212;
        System.out.println("value is"+i);

long l = i;
         System.out.println("value is"+l);

  2 narrowing downcasting
  long l = 7125564528933;
         System.out.println("value is"+l);

int x = (int)l;
        System.out.println(x);



 */