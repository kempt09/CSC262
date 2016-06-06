import java.util.Scanner;

public class Negpos {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num = 0;
    System.out.print("Enter a Number: ");
    num = input.nextInt();
    if(num < 0){
      System.out.printf("The Number is Negative %d%n", num);
    } else if(num == 0){
      System.out.printf("The Numeber is 0: %d%n", num);
    } else {
      System.out.printf("The Number is Positive: %d%n", num);
    }
  }
}
