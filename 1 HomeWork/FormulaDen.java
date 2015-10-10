import java.util.Scanner;

public class FormulaDen {

	public static void main(String[] args) {
		int den, mes, god, stolet, denNed;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the day");
		den = in.nextInt();
		System.out.println("Enter the month");
		mes = in.nextInt();
		System.out.println("Enter the year");
		god = in.nextInt();
		System.out.println("Enter the century");
		stolet = in.nextInt();
		denNed = (int) ((den + ((0.2 * (13 * mes - 1))) + god + ((god / 4)) + ((stolet / 4)) - (2 * stolet) + 777) % 7);// formula
		System.out.println(denNed);
		switch (denNed) { // condition switch
		case 1: // arguments
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
		case 0:
			System.out.println("Воскресение");
			break;
		}
	}
}
