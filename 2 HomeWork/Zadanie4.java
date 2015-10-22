
public class Zadanie4 {

	public static void main(String[] args) {
		int m = 0;
		int i = 0;
		int mass[] = new int[15];
		int n = 0;
		while (n <= 14) {
			mass[n] = (int) (Math.random() * 100 + 1);// randomly filling
			System.out.print(mass[n] + "|");
			if (m < mass[n]) {// Selecting the maximum and index
				m = mass[n];
				i = n;
			}
			n++;

		}
		System.out.println();
		System.out.println("Max  " + m + "  Index  " + i);
	}

}
