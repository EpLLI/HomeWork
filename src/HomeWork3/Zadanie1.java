package HomeWork3;

import java.util.*;

public class Zadanie1 {

	public static void main(String[] args) {

		System.out.print("Line: ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();// text Line

		int k = s.nextInt();// Room changing symbols
		String temp;
		String[] words = str.split("\\s");// breaking array
		for (int l = 0; l < words.length; l++) {// replacement cycle
			System.out.print("");

			if (k < words[l].length()) {// replacing condition
				temp = "";
				temp += words[l].substring(0, k - 1);
				temp += '@';
				temp += words[l].substring(k, words[l].length());

				words[l] = temp;
			}
			System.out.print(" " + words[l]);

		}
	}
}