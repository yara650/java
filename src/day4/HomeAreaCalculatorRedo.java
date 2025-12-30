package day4;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // to call the non static method in the static method
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
       Rectangle kitchen = calculator.getDimentions();
       Rectangle bathroom = calculator.getDimentions();
       calculator.scanner.close();
      double totalArea = calculator.calculateTotalArea(kitchen,bathroom);
        System.out.println("The total Area is " + totalArea);

    }
   public Rectangle getDimentions(){ // i use rectangle bc i return room from rectangle type
       // Scanner scanner = new Scanner(System.in);
        System.out.println("Enter room length");
        double length = scanner.nextDouble();
        System.out.println("Enter room width");
        double width = scanner.nextDouble();
        Rectangle room = new Rectangle(); // i put the length and the width in the rectangle objet to can
       // return them both
        room.setLength(length);
        room.setWidth(width);
        return room;
    }
    public double calculateTotalArea(Rectangle room1 , Rectangle room2){
       // double totalArea = room1.calculateArea()+room2.calculateArea();
      //  return totalArea;
       return room1.calculateArea()+room2.calculateArea();
    }
}
