package tipiMassiv;

import java.util.Scanner;

public class Zadanie3 {
	public static void main(String[] args) {

		int i = 0;
		int mass1[] = { 7, 5, 5, 6, 9, 1, 2, 3, 5, 0, 4, 6, 8, 7, 9 };//array initialization
		while (i <= 14) {
			System.out.print(mass1[i] + "|");
			i++;
		}

		System.out.println("");
		int a;
		Scanner scan = new Scanner(System.in);
		int mass2[] = new int[15];//array initialization
		int g = 0;
		while (g <= 14) {
			System.out.print("Natural number a : ");
			a = scan.nextInt();//fill with string
			mass2[g] = a;
			g++;
		}
		g = 0;
		while (g <= 14) {
			System.out.print(mass2[g] + "|");
			g++;
		}

		System.out.println("");
		int mass3[] = new int[15];//array initialization
		int n = 0;
		while (n <= 14) {
			mass3[n] = (int) (Math.random() * 10 + 1);//randomly filling
			System.out.print(mass3[n] + "|");
			n++;
		}

	}
}