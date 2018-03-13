package math;

import java.util.Scanner;

public class AverageConsumption {

  private static Scanner sc;

  public static void main(String[] args) {
    calculateAvgConsumption(distanceTravelled(), moneySpent(), gasPrice());
  }

  private static void calculateAvgConsumption(int distanceTravelled, int moneySpent, float price) {
    float moneyPer100km = (moneySpent * 100) / distanceTravelled;
    float result = moneyPer100km / price;
    System.out.println("Your average consumption is: " + result);
  }

  private static float gasPrice() {
    System.out.println("Enter gas price:");
    float x = scanFloat();
    return x;
  }

  private static int moneySpent() {
    System.out.println("Enter money spent:");
    int x = scanInt();
    return x;
  }

  private static int distanceTravelled() {
    System.out.println("Enter distance travelled:");
    int x = scanInt();
    return x;
  }

  private static int scanInt() {
    sc = new Scanner(System.in);
    int y = sc.nextInt();
    return y;
  }

  private static float scanFloat() {
    sc = new Scanner(System.in);
    float y = sc.nextFloat();
    return y;
  }

}
