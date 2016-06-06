import java.util.Scanner;

public class Largest {

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int[] arr = new int[10];
    int largestNum = arr[0];

    for(int i = 0; i < arr.length; i++){
      System.out.printf("Current count: %d%n", i);
      arr[i] = input.nextInt();
    }

    for (int n = 0; n < arr.length; n++){
      if(largestNum < arr[n]){
        largestNum = arr[n];
      }
    }

    System.out.printf("Largest Number Entered: %d%n", largestNum);

  }
}
