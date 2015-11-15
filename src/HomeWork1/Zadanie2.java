package HomeWork1;

import java.util.Scanner;

public class Zadanie2 {

	public static void main(String[] args) {
		int a, b;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		if (a < b) { // comparison
			System.out.println("less first");
		} else if (a > b) {
			System.out.println("The first big");
		} else {
			System.out.println("they are equal");
		}

	}

}
