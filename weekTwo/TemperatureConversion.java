import java.util.Scanner;

public class TemperatureConversion {
  static double convertCelcius(int num){
    return 5.0 / 9.0 * (num - 32);
  }

  static double convertFahrenheight(int num){
    return 9.0 / 5.0 * (num + 32);
  }

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.printf("Enter 1 to convert to Celcius%nEnter 2 to convert to fahrenheight%n");
    int decision = input.nextInt();
    System.out.println("Enter a temperature");
    int num = input.nextInt();
    if(decision == 1){
      System.out.println(convertCelcius(num) + "Celcius");
    } else if(decision == 2) {
      System.out.println(convertFahrenheight(num) + "Fahrenheight");
    } else {
      System.out.println("Invalid Conversion");
    }
  }
}
