public class Circle{
  Point position;
  double radius;

  public Circle(){
    this.position = new Point();
    this.radius = 0.0;
  }

  public Circle(Point pos, double radi){
    this.position = pos;
    this.radius = radi;
  }

  public void setPosition(Point pos){
    position = pos;
  }

  public String getPosition(){
    String xS = Integer.toString(position.getX());
    String yS = Integer.toString(position.getY());
    return xS + ", " + yS;
  }

  public void setRadius(double radi){
    radius = radi;
  }

  public double getRadius(){
    return radius;
  }

  public double getPerimeter(){
    return 2 * Math.PI * radius;
  }

  public double getArea(){
    return Math.PI * (Math.pow(radius, 2));
  }

  public void print(){
    System.out.println("Position: " + getPosition() + " Radius: " + getRadius());
  }

}
