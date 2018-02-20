package math;

import java.util.Scanner;

public class ShowCallPutAmount {

	public static void main(String[] args) {

		ShowCallPutAmount p = new ShowCallPutAmount();
		final int buget = p.registerNumber();
		p.calculate(buget);

	}

	public int registerNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter buget:");
		int buget = sc.nextInt();
		sc.close();
		return buget;
	}

	public void calculate(int buget) {
		float[] x = { 1, (float) 2.2, (float) 4.8, (float) 10.5, 24, (float) 57.5 };
		System.out.println("Amounts to Call/Put:");
		for (float y : x) {
			float result = (buget * y) / 100;
			System.out.println(result);
		}
	}
}
