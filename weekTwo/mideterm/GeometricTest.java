

public class GeometricTest {

  public static void main(String[] args){
    Circle circle = new Circle(new Point(7,3), 4.5);
    Rectangle rectangle = new Rectangle(new Point(3, -1), 4.0, 6.0);
    Square square = new Square(new Point(5,8), 2.0);
    System.out.println("=====First Iteration=====");
    circle.print();
    rectangle.print();
    square.print();
    square.setlength(5.0);
    System.out.println("=====Second Iteration=====");
    System.out.println("Circle: Perimeter = " + circle.getPerimeter() + " Area = " + circle.getArea());
    System.out.println("Rectangle: Perimeter = " + rectangle.getPerimeter() + " Area = " + rectangle.getArea());
    System.out.println("Square: Perimeter = " + square.getPerimeter() + " Area = " + square.getArea());
    System.out.println("=====Compare Square and Rectangle=====");
    if(rectangle.position.getX() > square.position.getX()){
      System.out.println("Rectangle X is greater than Square X");
    } else {
      System.out.println("Square X is greater than Rectangle X");
    }
  }
}
