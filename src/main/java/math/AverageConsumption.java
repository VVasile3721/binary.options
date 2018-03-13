package math;

import java.util.Scanner;

public class AverageConsumption {

  private static Scanner sc;

  public static void main(String[] args) {
    
    System.out.println("Enter distance travelled");
    float distanceTravelled = scanFloat();
    System.out.println("Enter money spent");
    float moneySpent = scanFloat();
    System.out.println("Enter gas price:");
    float gasPrice = scanFloat();
    calculateAvgConsumption(distanceTravelled, moneySpent, gasPrice);
  }

  private static void calculateAvgConsumption(float distanceTravelled, float allMoneySpent, float price) {
    float moneyPer100km = (allMoneySpent * 100) / distanceTravelled;
    float result = moneyPer100km / price;
    System.out.println("Your average consumption is: " + result);
  }

  private static float scanFloat() {
    sc = new Scanner(System.in);
    float y = sc.nextFloat();
    return y;
  }

}
