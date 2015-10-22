import java.util.Scanner;

public class Zadanie3z {

	public static void main(String[] args) {
		int n;

		Scanner scan = new Scanner(System.in);
		System.out.print("natural number n : ");
		n = scan.nextInt();
		int result = 1;
		for (int i = 2; i <= n; i++)
			result = result * i;//cycle factorial
		System.out.println(result);

	}

}
