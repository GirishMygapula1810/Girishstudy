package amazon.oops;

public class Result {
    public static void main(String[] args){
        Circle c = new Circle(10);
        Rectangle r = new Rectangle(10,12);

        c.displayArea();
        r.displayArea();
    }
}
abstract class Shape {
    abstract double area();

    void displayArea(){
        System.out.println(" Area " + area());
    }
}
class Circle extends Shape{
    private double radius;

    Circle(double radius){
        this.radius = radius;

    }
    @Override
    double area(){
        return Math.PI * radius * radius;

    }
}
class Rectangle extends Shape{
    private double length, width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length * width;
    }
}


