package HomeWork3;

import java.util.Scanner;

public class Zadanie3 {

	public static void main(String[] args) {
		System.out.print("Line: ");
		Scanner s = new Scanner(System.in);// text Line
		String str = s.nextLine().toLowerCase();
		String str1 = str.replaceAll("[^a-zA-Z]", " ");// replacement characters
		System.out.print(str1 + "  ");

	}

}
