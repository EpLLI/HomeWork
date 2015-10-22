import java.util.Scanner;

public class Zadanie6 {
	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		if (a % 100 > 10 && a % 100 < 15) { //condition exclusions
			System.out.println(a + " Rublei");
		} else if (a % 10 == 1) { // Condition 1 is the group of numbers
			System.out.println(a + " Rybl");
		} else if (a % 10 == 2) // Condition 2 is the group of numbers
		{
			System.out.println(a + " Rybla");
		} else if (a % 10 == 3) // Condition 2 is the group of numbers
		{
			System.out.println(a + " Rybla");
		} else if (a % 10 == 4) // Condition 2 is the group of numbers
		{
			System.out.println(a + " Rybla");
		} else {
			System.out.println(a + " Ryblei");
		}
	}
}