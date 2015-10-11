
public class ForMinMax {

	public static void main(String[] args) {
		int m = 0;
		int i = 100;
		int mass[] = new int[15];
		int n = 0;
		for (n = 0; n < 15;) {
			mass[n] = (int) (Math.random() * 100 + 1);// randomly filling
			System.out.print(mass[n] + "|");
			if (m < mass[n]) {// Selecting the maximum
				m = mass[n];
			}
			if (i > mass[n]) {// Selecting the minimum
				i = mass[n];
			}
			n++;

		}
		System.out.println();
		System.out.println("Max value " + m);
		System.out.println("Min value  " + i);

	}

}
