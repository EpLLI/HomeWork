
public class Zadanie7 {

	public static void main(String[] args) {
		int m = 0;

		int mass[] = { 7, 5, 5, 3, 9, 1, 0, 3, 5, 1 };// array initialization
		int n = 0;
		while (n <= 9) {
			System.out.print(mass[n] + "|");
			n++;

		}
		for (n = 0; n < 10;) {//to summ
			m = m + mass[n];
			if (mass[n] == 0)
				break;
			n++;
		}

		System.out.println();
		System.out.println("Summ  " + m);

	}

}
