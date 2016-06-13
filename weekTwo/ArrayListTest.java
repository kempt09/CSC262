import java.lang.Math;
import java.util.ArrayList;

public class ArrayListTest {

  public static void main(String[] args){
    ArrayList al = new ArrayList();
    for(int i = 0; i < 10; i++){
      double rand = Math.round(Math.random() * 10);
      al.add(Math.round(rand));
      System.out.println(al.get(i));
    }
    System.out.println("================ Remove first index ================");
    al.remove(0);
    for(int n = 0; n < al.size(); n++){
      System.out.println(al.get(n));
    }
  }
}
