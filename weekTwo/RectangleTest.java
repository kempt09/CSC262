public class RectangleTest {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    rectangle.setWidth(13);
    rectangle.setLength(5);
    rectangle.print();
    rectangle.setWidth(20.01f);
    rectangle.setLength(19.99f);
    System.out.println("Width is withing params = " + rectangle.withinParams(rectangle.getWidth()));
    System.out.println("Length is withing params = " + rectangle.withinParams(rectangle.getLength()));
  }
}
