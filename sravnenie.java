import java.util.Scanner;// инициализация ввода данных

public class sravnenie {

	public static void main(String[] args) {
		int a, b;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		if (a < b) { // сравнение
			System.out.println("Первое число меньше");
		} else if (a > b) {
			System.out.println("Первое число больше");
		} else {
			System.out.println("они равны");
		}

	}

}
