import java.util.Scanner;

public class Faktor {

	public static void main(String[] args) {
		int n;

		Scanner scan = new Scanner(System.in);
		System.out.print("натуральное число n : ");
		n = scan.nextInt();
		int result = 1;
		for (int i = 2; i <= n; i++)
			result = result * i;
		System.out.println(result);

	}

}
