import java.util.Scanner;

public class Zadanie2 {

	public static void main(String[] args) {
		System.out.print("Line: ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine().toLowerCase();
		;// text Line
		String str1 = str.replace(" ", "");// Removes spaces
		String codeString = "";
		char[] words = str1.toCharArray();// translate into an array of chars
		for (int l = 0; l < words.length; l++) {// write cycle line

			System.out.print(words[l] + "  ");
		}
		System.out.println();
		for (char c = 0; c < words.length; c++) {// write cycle line numbers

			System.out.printf(codeString + ((int) words[c] - 96) + "  ");

		}
	}

}
