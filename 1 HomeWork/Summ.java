import java.util.Scanner;

public class Summ {

	public static void main(String[] args) {
		int n;

		Scanner scan = new Scanner(System.in);
		System.out.print("Natural number n : ");
		n = scan.nextInt();
		int result = 0;
		for (int i = 1; i <= n; i++)// cycle calculation
			result = result + i;
		System.out.println(result);
	}

}
