package day2;

public class SwappingNumbers {
    public static void main(String[] args) {
//        int a = 10,b =20;
//        int tmp = a;
//        a=b;
//        b=tmp;
//        System.out.println(a);
//        System.out.println(b);
        int a=10, b=20;
        a=a+b; // 30
        b=a-b; // 10
        a=a-b; // 20
        System.out.println(a);
        System.out.println(b);
    }
}
