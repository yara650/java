package day4;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        // object from Rectangle class
        Rectangle room1 = new Rectangle(); // new for make place in memory
        room1.setLength(20);
        room1.setWidth(10);
       double areaOfRoom1 = room1.calculateArea();
        System.out.println("The area of room 1 is " + areaOfRoom1);

        Rectangle room2 = new Rectangle(20,10); // new for make place in memory
//        room2.setLength(10);
//        room2.setWidth(5);
//        double areaOfRoom2 = room2.calculateArea();
//        System.out.println("The area of room 2 is " + areaOfRoom2);
//        double totalArea = areaOfRoom1+areaOfRoom2;
//        System.out.println("total area is " + totalArea);
    }
}
