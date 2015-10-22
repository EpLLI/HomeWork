
public class Zadanie6 {

	public static void main(String[] args) {
		int m = 0;

		int mass[] = { 7, 5, -5, 6, 9, 1, 2, -3, 5, 0, 4, -6, 8, -7, 9 };// array initialization
		int n = 0;
		while (n <= 14) {
			System.out.print(mass[n] + "|");
			if (0 > mass[n]) {// The choice of values ​​< 0
				m++;

			}
			n++;

		}
		System.out.println();
		System.out.println("Negativ  " + m);

	}

}
