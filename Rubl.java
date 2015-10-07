import java.util.Scanner;// инициализация ввода данных

public class Rubl {
	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		if (a % 100 > 10 && a % 100 < 15) { // условие исключений
			System.out.println(a + " Рублей");
		} else if (a % 10 == 1) { // условие 1 группы цифр
			System.out.println(a + " Рубль");
		} else if (a % 10 == 2) // условие 2 группы цифр
		{
			System.out.println(a + " Рубля");
		} else if (a % 10 == 3) // условие 2 группы цифр
		{
			System.out.println(a + " Рубля");
		} else if (a % 10 == 4) // условие 2 группы цифр
		{
			System.out.println(a + " Рубля");
		} else {
			System.out.println(a + " Рублей");
		}
	}
}