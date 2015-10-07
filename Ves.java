import java.util.Scanner;// инициализация ввода данных

public class Ves {

	public static void main(String[] args) {
		int vesR, rost, vesRec;
		Scanner in = new Scanner(System.in);
		vesR = in.nextInt();
		rost = in.nextInt();
		vesRec = (rost - 100); // вычисление веса нормального
		if (vesR > vesRec) { // сравнение с настоящим
			System.out.println("Похудей");
		} else {
			System.out.println("Больше кушай");
		}

	}

}
