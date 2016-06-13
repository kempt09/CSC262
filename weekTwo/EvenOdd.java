import java.util.Scanner;

public class EvenOdd {
  static String isEven(int num){
    if(num % 2 == 0){
      return "even";
    } else {
      return "odd";
    }
  };
  public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      int someNumber = 0;
      System.out.println("Enter an integer greater than one, enter an integer less than 0 to exit.");
      while(someNumber > -1){
        someNumber = input.nextInt();
        if(someNumber < 0){
          return;
        } else {
          System.out.println("The number is: " + isEven(someNumber));
        }
      }

  };
}
