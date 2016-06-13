public class Square{
  Point position;
  double length;

  public Square(){
    this.position = new Point();
    this.length = 0;
  }

  public Square(Point pos, double length){
    this.position = pos;
    this.length = length;
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

  public double getPerimeter(){
    return length * 4;
  }

  public double getArea(){
    return length * length;
  }

  public void print(){
    System.out.println("Position: " + getPosition() + " Length: " + getLength());
  }

}
