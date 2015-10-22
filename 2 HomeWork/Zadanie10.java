
public class Zadanie10 {

	public static void main(String[] args) {
		int m = 5;
		int mass[][] = new int[m][m];
		for (int n = 0; n < m; n++) {
			for (int j = 0; j < m; j++) {
				mass[n][j] = (int) (Math.random() * 100 + 1);// randomly filling
				System.out.print(mass[n][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("main diog");
		int glav[] = new int[m];
		for (int k = 0; k < m; k++) {// finding the main diagonal
			int j = 0;
			j = k;
			int n = 0;
			n = k;
			glav[k] = mass[n][j];
			System.out.print(glav[k] + "\t");
		}
		System.out.println();
		System.out.println("dop diog");
		int dop[] = new int[m];
		for (int d = 0; d < m; d++) {// finding the dop diagonal

			int c = 0;
			c = d;
			int g = m - 1;
			int x = g - d;
			dop[d] = mass[c][x];
			System.out.print(dop[d] + "\t");
		}

	}
}
