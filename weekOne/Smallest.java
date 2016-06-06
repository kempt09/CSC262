import java.util.Scanner;
import java.util.Vector;

public class Smallest {

  public static void main(String[] args){

    Vector<Integer> arr = new Vector<>();
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the number of values to read.");

    int iterations = input.nextInt();

    for(int i = 0; i < iterations; i++){
      System.out.printf("Current count: %d%n", i);
      arr.add(input.nextInt());
    }

    int smallestNum = arr.elementAt(0);

    for (int n = 0; n < arr.size(); n++){
      if(smallestNum > arr.elementAt(n)){
        smallestNum = arr.elementAt(n);
      }
    }

    System.out.printf("Smallest Number Entered: %d%n", smallestNum);

  }
}
