
public class Zadanie6z {

	public static void main(String[] args) {
		double x, y = 0;
		x = -4;
		while (x <= 4) {// cycle calculation
			y = 2 * x * x - 5 * x - 8;
			x = x + 0.5;
			System.out.println(y);
		}

	}

}
