public class Arrays {

  public static void main(String[] args){
    int[] arrOne = new int[10];
    int[] bonus = new int[15];
    int[] bestScores = {90, 88, 92, 100, 86};
    int counter = 0;
    for (int i = 0; i < arrOne.length; i++){
      arrOne[i] = 0;
      System.out.println("Contents of array index: " + i + " " + arrOne[i]);
    }
    for(int n = 0; n < bonus.length; n ++){
      bonus[n] = counter + 1;
      System.out.println("Contents of Bonus: " + bonus[n]);
      counter++;
    }
    System.out.printf("%s%8s%n", "Index", "Value");
    for(int k = 0; k < bestScores.length; k++){
      System.out.printf("%5d%8d%n", k, bestScores[k]);
    }
  }
}
