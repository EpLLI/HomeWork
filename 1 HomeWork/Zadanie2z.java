import java.util.Scanner;

public class Zadanie2z {
	public static void main(String[] args) {
		int n;

		Scanner scan = new Scanner(System.in);
		System.out.print("Natural number n : ");
		n = scan.nextInt();
		double result = 0;
		for (int i = 1; i <= n; i++)//cycle calculation
			result = (result + (1d / i));
		System.out.println(result);
	}

}