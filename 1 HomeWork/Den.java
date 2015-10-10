import java.util.Scanner;// инициализация ввода данных

public class Den {
	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		switch (a) { // задаём выражение свича
		case 1: // аргументы
			System.out.println("Понедельник");
			break;
		case 2:
			System.out.println("Вторник");
			break;
		case 3:
			System.out.println("Среда");
			break;
		case 4:
			System.out.println("Четверг");
			break;
		case 5:
			System.out.println("Пятница");
			break;
		case 6:
			System.out.println("Субота");
			break;
		case 7:
			System.out.println("Воскресение");
			break;
		default: // при не существующем
			System.out.println("Дня с таким номером не существует");
		}

	}

}
