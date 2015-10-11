
public class YmnozenieDo0 {

	public static void main(String[] args) {
		int m = 1;
		int mass[] = { 1, 2, 3, 4, 5, 0, 2, 3, 5, 1 };// array initialization
		int n = 0;
		while (n <= 9) {
			System.out.print(mass[n] + "|");
			n++;

		}
		for (n = 0; n < 10;) {

			if (mass[n] == 0)//to multiply
				break;
			m = m * mass[n];

			n++;
		}

		System.out.println();
		System.out.println("Multiplication  " + m);

	}

}
