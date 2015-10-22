import java.util.Scanner;

public class Zadanie5 {

	public static void main(String[] args) {
		int vesR, rost, vesRec;
		Scanner in = new Scanner(System.in);
		vesR = in.nextInt();//weight
		rost = in.nextInt();//growth
		vesRec = (rost - 100); // calculation of normal weight
		if (vesR > vesRec) { // Compare with the present
			System.out.println("Lose Weight");
		} else {
			System.out.println("to eat");
		}

	}

}
