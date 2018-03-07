package math;

import java.util.Scanner;

public class ShowCallPutAmount {

  public static void main(String[] args) {
    calculate(registerNumber());
  }

  private static int registerNumber() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter buget:");
    int buget = sc.nextInt();
    sc.close();
    return buget;
  }

  private static void calculate(int buget) {
    float[] x = { 1, 2.2F, 4.8F, 10.5F, 24, 57.5F };
    System.out.println("Amounts to Call/Put:");
    for (float y : x) {
      float result = (buget * y) / 100;
      System.out.println(result);
    }
  }
}
