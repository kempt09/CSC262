
public class Point {
  private int x;
  private int y;

  public Point(){
    this.x = 0;
    this.y = 0;
  }

  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  public void setX(int newX){
    x = newX;
  }

  public int getX(){
    return x;
  }

  public void setY(int newY){
    y = newY;
  }

  public int getY(){
    return y;
  }

  public void print(){
    System.out.println("Point: X = " + x + " Y = " + y);
  }


}
