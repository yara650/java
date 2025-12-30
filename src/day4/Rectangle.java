package day4;
// just class
public class Rectangle {
    // No values in this two fields just Initial value = 0 , property , attributes
    // encapsulation cant access any class ( field, property , attribute ) to another class directly
    // so that we make it private , and make setters and getters methods
    // Always make the fields private and the methods public
    private double length;
    private double width;
    public Rectangle(){   ///  constructor
        System.out.println(" I am default constructor ");
        length=0;
        width=0;
    }
    public Rectangle( double length , double width) {   ///  constructor
        System.out.println(" I am parameterized constructor ");
        this.length = length;
         setWidth(width);  //    this.width = width;
    }
    // setters
   public void setLength(double length){
        this.length=length;
    }
    public void setWidth(double width){

       this.width=width;
    }
    // getters
    public double getLength(double length){

       return length;
    }
    public double getWidth(double width){
        return width;
    }

    // two methods
    double calculateArea(){
      //  double area = length*width;
      //  return area;
        return length*width;

    } double calculatePerimeter(){
        double perimeter = length*2+width*2;
        return perimeter;
    }
}
