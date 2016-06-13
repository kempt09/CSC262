public class Rectangle{
  Point position;
  double length;
  double width;

  public Rectangle(){
    this.position = new Point();
    this.length = 0;
    this.width = 0;
  }

  public Rectangle(Point pos, double length, double width){
    this.position = pos;
    this.length = length;
    this.width = width;
  }

  public void setPosition(Point pos){
    position = pos;
  }

  public String getPosition(){
    String xS = Integer.toString(position.getX());
    String yS = Integer.toString(position.getY());
    return xS + ", " + yS;
  }

  public void setlength(double len){
    length = len;
  }

  public double getLength(){
    return length;
  }

  public void setWidth(double wid){
    width = wid;
  }

  public double getWidth(){
    return width;
  }

  public double getPerimeter(){
    return (length * 2) + (width * 2);
  }

  public double getArea(){
    return length * width;
  }

  public void print(){
    System.out.println("Position: " + getPosition() + " Length: " + getLength() + " Width: " + getWidth());
  }

}
