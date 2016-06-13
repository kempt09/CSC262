public class Rectangle{
  float length;
  float width;

  public Rectangle(){
    this.length = 1;
    this.width = 1;
  }

  public Rectangle(float length, float width){
    this.length = length;
    this.width = width;
  }

  public void setLength(float len){
    length = len;
  }

  public float getLength(){
    return length;
  }

  public void setWidth(float wid){
    width = wid;
  }

  public float getWidth(){
    return width;
  }

  public boolean withinParams(float num){
    if(num >= 0.0 && num <= 20.0){
      return true;
    } else {
      return false;
    }
  }
  public void print(){
    System.out.println("Length: " + getLength() + " Width: " + getWidth());
  }
}
