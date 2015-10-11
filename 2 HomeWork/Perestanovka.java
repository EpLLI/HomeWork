
public class Perestanovka {

	public static void main(String[] args) {

		int mass[] = { 1, 2, 3, 4, 5, 0, 2, 1, 5, 1 };// array initialization
		int n = 0;
		while (n <= 9) {
			if (n == 9) {
				System.out.println(mass[n] + "|");
				break;
			}
			System.out.print(mass[n] + "|");
			n++;
		}
		int nov[] = new int[10];
		System.out.print("New mass:                     ");
		int k = 0;
		for (int i = 0; i < 10; i++) {//calculation of displacements
			if (mass[i] == 0)
				continue;
			nov[k] = mass[i];
			k = k + 1;
		}

		System.out.println();
		for (int i = 0; i < 10; i++) {//The conclusion of the new array
			if (i == 9) {
				System.out.println(nov[i] + "|");
				break;
			}
			System.out.print(nov[i] + "|");
		}

	}
}
