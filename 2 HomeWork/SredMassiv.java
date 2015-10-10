
public class SredMassiv {

	public static void main(String[] args) {
		float mass[] = new float[10];// array initialization
		int i = 0;
		while (i <= 9) {
			mass[i] = (float) (Math.random() * 10 + 1);// randomly filling
			System.out.print(mass[i] + "|");
			i++;

		}
		float sred = (mass[0] + mass[9]) / 2;// calculation of average
		System.out.println("average value=" + sred);
	}
}
