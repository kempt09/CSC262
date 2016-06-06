import java.util.Scanner;

public class Oddeven {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num = 0;
    System.out.print("Enter a Number: ");
    num = input.nextInt();
    if(num % 2 == 0){
      System.out.printf("The Number %d is Even. %n", num);
    } else {
      System.out.printf("The Number %d is Odd. %n", num);
    }
  }
}
