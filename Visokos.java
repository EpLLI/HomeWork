import java.util.Scanner;// инициализация ввода данных

public class Visokos {

	public static void main(String[] args) {
		int year;
		Scanner in = new Scanner(System.in);// ввод данных
		year = in.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {// определение
																	// года
			System.out.println(" Високостный");
		} else {
			System.out.println("Не Високостный");
		}
	}
}