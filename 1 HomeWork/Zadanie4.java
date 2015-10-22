import java.util.Scanner;// инициализация ввода данных

public class Zadanie4 {

	public static void main(String[] args) {
		int year;
		Scanner in = new Scanner(System.in);// Entering the year
		year = in.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {//Determination of the year
			System.out.println(" Visokostny");
		} else {
			System.out.println("Ne Visokostny");
		}
	}
}