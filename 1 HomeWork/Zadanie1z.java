import java.util.Scanner;

public class Zadanie1z {

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
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 0:
			System.out.println("Sunday");
			break;
		}
	}
}
